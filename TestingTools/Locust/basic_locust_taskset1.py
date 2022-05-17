# Run using: locut -f basic_locust.py --host="https://xyz.com/" classname --headless -u 5 -r 1 -t 60s --logfile logfile/mylog.log --loglevel DEBUG --only-summary
# r-> hatchrate (rate at whihc users will arrive, 1user/s)  t->rumtime u ->num of users
from locust import HttpUser, User, task, between, constant, constant_pacing, events, TaskSet
from datetime import datetime


class UserBehaviour(TaskSet):

    @task()
    def on_start(self):
        print(datetime.now())

    @task()
    def doing_work(self):
        print(datetime.now())


class MyWebUser(HttpUser):

    wait_time = between(1, 2)
    host = "https://xyz.com/"
    # providing weightage of users Ration 3:1 between web and mobile.
    weight = 3

    tasks = [UserBehaviour]

    @task()
    def make_product(self):
        print(datetime.now())

    @task()
    def on_stop(self):  # test stops or is interrupted
        print(datetime.now())
