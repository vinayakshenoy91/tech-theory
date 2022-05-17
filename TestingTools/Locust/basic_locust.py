# Run using: locut -f basic_locust.py --host="https://xyz.com/" classname --headless -u 5 -r 1 -t 60s --logfile logfile/mylog.log --loglevel DEBUG --only-summary
# r-> hatchrate (rate at whihc users will arrive, 1user/s)  t->rumtime u ->num of users
from locust import HttpUser, User, task, between, constant, constant_pacing, events
from datetime import datetime


@events.test_start.add_listeners
def script_start(**kwargs):
    print("connecting to DB")


@events.test_stop.add_listeners
def script_stop(**kwargs):
    print("Tearing down DB")

#    @task
#    def make_product(userclass):   #declared incase task list is used
#        print(datetime.now())


class MyWebUser(HttpUser):

    wait_time = between(1, 2)
    host = "https://xyz.com/"
    # providing weightage of users Ration 3:1 between web and mobile.
    weight = 3

    # tasks=[doing_work,make_product]  -> Declare these functions outside.
    # tasks={doing_work:3,make_product:6} -> Weightage to task

    @task
    def on_start(self):
        print(datetime.now())

    @task  # @task(2)
    def doing_work(self):
        print(datetime.now())

    # @task(4) -> weightage to task and it is only a probablility. This task will be called more times than others.
    @task
    def make_product(self):
        print(datetime.now())

    @task
    def on_stop(self):  # test stops or is interrupted
        print(datetime.now())


class MyMobileUser(HttpUser):

    wait_time = between(1, 2)
    host = "https://xyz.com/"
    weight = 1  # providing weightage of users
    @task
    def login_URL(self):
        print(datetime.now())
