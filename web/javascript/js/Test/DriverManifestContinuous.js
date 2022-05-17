const axios = require('axios');

let request = {
    "docId": "vin-test-9746",
    "docType": "DriverManifest",
    "docFormat": "pdf",
    "orderDetails": [
        {
            "gridReference": "24241232323",
            "dropSequence": 2,
            "deliverySlot": {
                "slotStart": "09:00",
                "slotEnd": "10:00",
                "scheduledArrival": "09:05"
            },
            "distance": {
                "value": 19,
                "unit": "miles"
            },
            "totalItems": 42,
            "trayInfo": "This customer has  5 Ambient trays, 2 chilled trays, 1 Frozen trays",
            "deliveryInstructions": "",
            "cdaNotes": "",
            "customerOrderShortId": "SSSSSSSSSSSSSS",
            "fulfillmentOrderShortId": "ABCDEF",
            "customer": {
                "fullName": "Mr May Pai asdasdasdasdasdasdASDASdasdasd ",
                "address": {
                    "line1": "Plus, Shire Park asdasdasdasdasdasdasdasdaSFASDasdasdsdf",
                    "line2": "",
                    "city": "Welwyn Garden City",
                    "state": "",
                    "postalCode": "AL7 1GB"
                },
                "phone": {
                    "day": "012345678901",
                    "evening": "",
                    "mobile": ""
                }
            },
            "weight": {
                "value": 50,
                "unit": "kg"
            },
            "moreInfo": "This customer has  5 Ambient trays, 2 chilled trays, 1 Frozen trays Dotcom Shop: Please use extra 2 min for this delivery to explain our service and welcome them to Tesco.com"
        },
        {
            "gridReference": "2424123232",
            "dropSequence": 1,
            "deliverySlot": {
                "slotStart": "09:00",
                "slotEnd": "10:00",
                "scheduledArrival": "09:05"
            },
            "distance": {
                "value": 19,
                "unit": "miles"
            },
            "totalItems": 42,
            "trayInfo": "This customer has two chilled trays",
            "deliveryInstructions": "",
            "cdaNotes": "",
            "customerOrderShortId": "SSSSSSSSSSSSSS",
            "fulfillmentOrderShortId": "ABCDEFG",
            "customer": {
                "fullName": "Mr John Mail ",
                "address": {
                    "line1": "Plus, Shire Park,",
                    "line2": "ZDFDFSDF",
                    "city": "Welwyn Garden City",
                    "state": "",
                    "postalCode": "AL7 1GB"
                },
                "phone": {
                    "day": "012345678901",
                    "evening": "",
                    "mobile": ""
                }
            },
            "weight": {
                "value": 50,
                "unit": "kg"
            }
        },
        {
            "gridReference": "2424123232",
            "dropSequence": 3,
            "deliverySlot": {
                "slotStart": "09:00",
                "slotEnd": "10:00",
                "scheduledArrival": "09:05"
            },
            "distance": {
                "value": 19,
                "unit": "miles"
            },
            "totalItems": 42,
            "trayInfo": "This customer has two chilled trays",
            "deliveryInstructions": "",
            "cdaNotes": "",
            "customerOrderShortId": "24503678",
            "fulfillmentOrderShortId": "8683",
            "customer": {
                "fullName": "Mr Test x",
                "address": {
                    "line1": "Plus, Shire Park,",
                    "line2": "ZDFDFSDF",
                    "city": "Welwyn Garden City",
                    "state": "",
                    "postalCode": "AL7 1GB"
                },
                "phone": {
                    "day": "012345678901",
                    "evening": "",
                    "mobile": ""
                }
            },
            "weight": {
                "value": 50,
                "unit": "kg"
            }
        }
    ],
    "tripStartTime": "01/03/2016 08:45:00",
    "tripEndTime": "01/03/2016 09:40:00",
    "friendlyVehicleId": "9999999",
    "trays": [
        {
            "zone": "AM",
            "trayCount": 4
        },
        {
            "zone": "CH",
            "trayCount": 2
        },
        {
            "zone": "FZ",
            "trayCount": 1
        }
    ],
    "distance": {
        "value": 24,
        "unit": "miles"
    },
    "weight": {
        "value": 50,
        "unit": "kg"
    }
};


async function xyz() {

    for (let i = 0; i < 2000000; i++) {
        for (let p = 0; p < 2000000000; p++) {

        }

        try {
            let y = await axios.post('http://10.118.139.98/v1/document/driver-manifest', request);
            console.log("Request successful")
        } catch (e) {
            console.log("Request failed" + e);
        }
    }

}

xyz();