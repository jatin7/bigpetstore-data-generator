# parameters for simulation

TRANSACTION_TRIGGER_TIME_AVERAGE = 5.0 # days
TRANSACTION_TRIGGER_TIME_VARIANCE = 2.0
TRANSACTION_TRIGGER_TIME_MAX = 10.0
TRANSACTION_TRIGGER_TIME_MIN = 1.0

PURCHASE_TRIGGER_TIME_AVERAGE = 10.0
PURCHASE_TRIGGER_TIME_VARIANCE = 4.0
PURCHASE_TRIGGER_TIME_MAX = 20.0
PURCHASE_TRIGGER_TIME_MIN = 1.0

AVERAGE_CUSTOMER_STORE_DISTANCE = 5.0 # miles

MAX_PETS = 10
MIN_PETS = 1

STORE_INCOME_SCALING_FACTOR = 100.0

ZIPCODE_DATA_FILES = {
    "income_fl" : "../../resources/ACS_12_5YR_S1903/ACS_12_5YR_S1903_with_ann.csv",
    "population_fl" : "../../resources/population_data.csv",
    "coordinate_fl" : "../../resources/zips.csv"
    }

NAMEDB_FILE = "../../resources/namedb/data/data.dat"

PRODUCTS_FILE = "product_categories.json"
