package com.smr.estate.Constant;

public class Constant
{
    //Server address
    public static final String BASE_URL = "http://10.0.2.2:3000/api/";
    public static final String IMAGE_URL = BASE_URL + "storage/";

    //*************************************************************************//

    public static final int REQUEST_SELECT_ADS_IMAGE = 310;
    public static final int REQUEST_SELECT_PROFILE_IMAGE = 321;
    public static final int REQUEST_SELECT_ALLOWED_IMAGE = 338;
    public static final int REQUEST_SELECT_STATE = 414;
    public static final int REQUEST_SELECT_CITY = 416;
    public static final int REQUEST_SELECT_REGION = 418;
    public static final int REQUEST_SELECT_LOCATION = 424;
    public static final int REQUEST_SELECT_CATEGORY = 433;

    public static final int REQUEST_PERMISSIONS_READ_EXTERNAL_STORAGE_FOR_ADS = 513;
    public static final int REQUEST_PERMISSIONS_READ_EXTERNAL_STORAGE_FOR_PROFILE = 523;
    public static final int REQUEST_PERMISSIONS_READ_EXTERNAL_STORAGE_FOR_ALLOWED = 534;
    public static final int REQUEST_PERMISSIONS_LOCATION = 542;

    public static final int RESULT_OK = -1;

    public static final int REQUEST_FILTER_HOME_FRAGMENT = 614;
    public static final int REQUEST_DELETE_ADS = 628;

    public static final int IMAGE_MAX_SIZE = 500;

    //Total
    public static final String KEY_ID = "id";
    public static final String USER_ID = "user_id";
    public static final String ROLE = "role";
    public static final String PAGE = "page";
    public static final String PROVINCE = "province";
    public static final String SEARCH_TEXT = "searchString";
    public static final String TELL = "tell";
    public static final String KEY_NO_IMAGE = "NO_IMAGE";
    //.....................................................//

    //Register Or Update
    public static final String UPDATE = "update";
    public static final String INSERT = "insert";
    public static final String REQUEST_TYPE = "request_type";
    public static final String LICENSE_IMAGE = "licenseImage";
    public static final String MOBILE = "mobile";
    //.....................................................//

    //Checked Permission
    public static final String IS_IMAGE = "image";
    public static final String IS_PUBLIC = "status";
    public static final String IS_EXPIRE = "expire";
    //.....................................................//

    //Profile
    public static final String EMAIL = "email";
    public static final String IMG_PROFILE_CHECK = IMAGE_URL + "avatar/avatar.png";
    //.....................................................//

    //Note
    public static final String KEY_EVENT_DATE = "event_date";
    public static final String KEY_EVENT = "event";
    public static final String KEY_NOTE_ID = "event_id";
    public static final String KEY_NOTE = "note";
    public static final String KEY_NOTE_CHECK = "checkNote";
    //.....................................................//

    //Detail Post
    public static final String ESTATE_ID = "id";
    public static final String KEY_POST_ID = "postId";
    public static final String KEY_TITLE = "title";
    public static final String KEY_PRICE = "price";
    public static final String KEY_TIME = "time";
    public static final String KEY_CAT = "cat";
    public static final String KEY_TYPE = "type";
    public static final String KEY_IS_EXPIRE = "isExpire";
    public static final String KEY_IMAGE1 = "image1";
    public static final String KEY_IMAGE2 = "image2";
    public static final String KEY_IMAGE3 = "image3";
    public static final String KEY_IMAGE4 = "image4";
    public static final String KEY_IMAGE5 = "image5";
    public static final String IMG_CHECK = IMAGE_URL + "image/house.png";
    //.....................................................//

    //Filter activity
    public static final String KEY_FILTER_DATA_JSON = "filterDataJson";
    public static final String KEY_SELECTED_ID = "selectedId";
    //.....................................................//

    //Restore
    public static final String KEY_DRAFT_CHECK = "checkDraft";
    public static final String KEY_DRAFT = "draft";
    public static final String KEY_DRAFT_POSS = "draftPoss";
    public static final String KEY_SET_ADS = "set_ads";
    public static final String KEY_SELLING_ID = "sell_id";
    //.....................................................//

    //Post Item
    public static final String TITLE = "title";
    public static final String NAME = "name";
    public static final String LAST_NAME = "last_name";
    public static final String STATE = "state";
    public static final String CITY = "city";
    public static final String REGION = "region";
    public static final String STATES_ID = "states_id";
    public static final String CONSULT_STATE_NAME = "state_name";
    public static final String PASS = "password";
    public static final String REF = "ref";
    public static final String BREADTH = "breadth";
    public static final String PRICE = "price";
    public static final String RENT_PRICE = "rent";
    public static final String GEO_LAT = "lat";
    public static final String GEO_LON = "lon";
    public static final String ADDRESS = "address";
    public static final String AREA = "area";
    public static final String CONS_ID = "cons_id";
    public static final String AGENT_ID = "agent_id";
    public static final String SELLER_NAME = "seller_name";
    public static final String SELLER_TELL = "tel";
    public static final String IMAGE = "image";
    public static final String BUILT_IN = "built_in";
    public static final String DESCRIPTION = "discription";
    public static final String TYPE = "type";
    public static final String STATUS = "status";
    public static final String OFFICIAL_DOCUMENT = "official_doc";
    public static final String EXPIRE = "expire";
    public static final String SELLING_TYPE = "selling_type";
    public static final String POSSIBILITIES = "possibilities";
    public static final String OFFER = "offer";
    //1
    public static final String OFFER1 = "offer";

    //.....................................................//

    //Selling Name
    public static final String SALE = "????????";
    public static final String FULL_MORTGAGE = "?????? ????????";
    public static final String RENT = "?????? ?? ??????????";
    public static final String PRE_BUY = "?????? ????????";
    public static final String SWAP = "????????????";
    public static final String TAKING_PART = "????????????";
    //.....................................................//

    //Selling Id
    public static final String SALE_ID = "1";
    public static final String FULL_MORTGAGE_ID = "2";
    public static final String RENT_ID = "3";
    public static final String PRE_BUY_ID = "4";
    public static final String SWAP_ID = "5";
    public static final String TAKING_PART_ID = "6";
    //.....................................................//

    //Possibilities Name
    public static final String ROOM = "????????";
    public static final String WALL_CUPBOARD = "?????? ????????????";
    public static final String KITCHEN = "????????????????";
    public static final String BATHROOM = "????????";
    public static final String WC_STATION = "?????????? ??????????";
    public static final String WC = "?????????? ????????????";
    public static final String TELEPHONE = "???? ????????";
    public static final String PARKING = "??????????????";
    public static final String WATER_METER = "?????????? ????";
    public static final String ELECTRICITY_METER = "?????????? ??????";
    public static final String GAS_METER = "?????????? ??????";
    public static final String WAREHOUSE = "??????????";
    public static final String PAINT = "??????????";
    public static final String TERRACE = "????????";
    public static final String IPHONE_VIDEO = "?????????? ????????????";
    public static final String ELEVATOR = "??????????????";
    public static final String ELECTRIC_DOOR = "?????? ????????";
    public static final String WALLPAPER = "???????? ????????????";
    public static final String SAUNA = "????????";
    public static final String SWIMMING_POOL = "??????????";
    public static final String WATER_COOLER = "???????? ??????";
    public static final String GAS_COOLER = "???????? ????????";
    public static final String PACKAGE = "????????";
    public static final String WATER_HEATER = "???? ??????????";
    public static final String RADIANT = "????????????????";
    public static final String FLOOR_HEATING = "???????????? ???? ????";
    public static final String AIR_CONDITIONER = "?????????? ??????";
    public static final String CHILLER = "????????";
    public static final String PROTECTIVE_SHADE = "?????????? ??????????";
    public static final String BURGLAR_ALARM = "????????????";
    public static final String GUARD = "????????????";
    public static final String ABATTOIR = "??????????????????";
    public static final String SHOWCASE = "????????????";
    public static final String SHELF = "????????";
    public static final String WATER_WELL = "?????? ????";
    public static final String FIRE_ALARM = "?????????? ????????";
    public static final String FAN_COIL = "???? ????????";
    public static final String RESTAURANT = "??????????????";
    public static final String PARTY_ROOM = "???????? ??????";
    public static final String SPORT_ROOM = "???????? ????????";
    public static final String LOBBY = "????????";
    public static final String COFFEE_SHOP = "????????";
    public static final String FURNITURE = "????????????";
    public static final String KIDS_PARK = "???????? ????????";
    public static final String FOUNTAIN = "??????????";
    public static final String AMUSEMENT = "???????? ????????????";
    public static final String CCTV = "???????????? ????????????????";
    public static final String YARD = "????????";
    //.....................................................//

    //Possibilities Id
    public static final String ROOM_ID = "1";
    public static final String WALL_CUPBOARD_ID = "2";
    public static final String KITCHEN_ID = "3";
    public static final String BATHROOM_ID = "4";
    public static final String WC_STATION_ID = "5";
    public static final String WC_ID = "6";
    public static final String TELEPHONE_ID = "7";
    public static final String PARKING_ID = "8";
    public static final String WATER_METER_ID = "9";
    public static final String ELECTRICITY_METER_ID = "10";
    public static final String GAS_METER_ID = "11";
    public static final String WAREHOUSE_ID = "12";
    public static final String PAINT_ID = "13";
    public static final String TERRACE_ID = "14";
    public static final String IPHONE_VIDEO_ID = "15";
    public static final String ELEVATOR_ID = "16";
    public static final String ELECTRIC_DOOR_ID = "17";
    public static final String WALLPAPER_ID = "18";
    public static final String SAUNA_ID = "19";
    public static final String SWIMMING_POOL_ID = "20";
    public static final String WATER_COOLER_ID = "21";
    public static final String GAS_COOLER_ID = "22";
    public static final String PACKAGE_ID = "23";
    public static final String WATER_HEATER_ID = "24";
    public static final String RADIANT_ID = "25";
    public static final String FLOOR_HEATING_ID = "26";
    public static final String AIR_CONDITIONER_ID = "27";
    public static final String CHILLER_ID = "28";
    public static final String PROTECTIVE_SHADE_ID = "29";
    public static final String BURGLAR_ALARM_ID = "30";
    public static final String GUARD_ID = "31";
    public static final String ABATTOIR_ID = "32";
    public static final String SHOWCASE_ID = "33";
    public static final String SHELF_ID = "34";
    public static final String WATER_WELL_ID = "35";
    public static final String FIRE_ALARM_ID = "36";
    public static final String FAN_COIL_ID = "37";
    public static final String RESTAURANT_ID = "38";
    public static final String PARTY_ROOM_ID = "39";
    public static final String SPORT_ROOM_ID = "40";
    public static final String LOBBY_ID = "41";
    public static final String COFFEE_SHOP_ID = "42";
    public static final String FURNITURE_ID = "43";
    public static final String KIDS_PARK_ID = "44";
    public static final String FOUNTAIN_ID = "45";
    public static final String AMUSEMENT_ID = "46";
    public static final String CCTV_ID = "47";
    public static final String YARD_ID = "48";
    //.....................................................//

    //Offer Name
    public static final String VIP = "?????????????? ????????";
    public static final String QUICK = "????????";
    public static final String LUX = "????????";
    //.....................................................//

    //Offer Id
    public static final String VIP_ID = "1";
    public static final String QUICK_ID = "2";
    public static final String LUX_ID = "3";
    //.....................................................//

    //Category List Name
    public static final String PENT_HOUSE = "?????? ????????";
    public static final String APARTMENT = "????????????????";
    public static final String RESIDENTIAL_COMPLEX = "?????????? ????????????";
    public static final String HOUSE = "???????? ????????????";
    public static final String VILLAGE = "????????";
    public static final String SUITES = "??????????";
    public static final String OFFICE = "??????????";
    public static final String SHOP = "?????????? ?? ??????????";
    public static final String GARDEN = "??????";
    public static final String LAND_PLOTS = "???????? ????????";
    public static final String FARM = "???????? ??????????";
    public static final String WORKSHOP = "????????????";
    public static final String HALL = "????????";
    public static final String HOTEL = "??????";
    public static final String STORE = "??????????";
    public static final String FACTORY = "??????????????";
    //.....................................................//

    //Category Id
    public static final String PENT_HOUSE_ID = "1";
    public static final String APARTMENT_ID = "2";
    public static final String RESIDENTIAL_COMPLEX_ID = "3";
    public static final String HOUSE_ID = "4";
    public static final String VILLAGE_ID = "5";
    public static final String SUITES_ID = "6";
    public static final String OFFICE_ID = "7";
    public static final String SHOP_ID = "8";
    public static final String GARDEN_ID = "9";
    public static final String LAND_PLOTS_ID = "10";
    public static final String FARM_ID = "11";
    public static final String WORKSHOP_ID = "12";
    public static final String HALL_ID = "13";
    public static final String HOTEL_ID = "14";
    public static final String STORE_ID = "15";
    public static final String FACTORY_ID = "16";
    //.....................................................//

    //State List Name
    public static final String ALBORZ = "??????????";
    //.....................................................//

    //State List Name
    public static final String ALBORZ_ID = "1";
    //.....................................................//

    //City List Name
    public static final String FARDIS = "??????????";
    public static final String SELECT_CITY = "???????????? ?????? ...";
    //.....................................................//

    //City List ID
    public static final String FARDIS_ID = "1";
    public static final String SELECT_CITY_ID = "0";
    //.....................................................//

    //Area List Name
    public static final String SELECT_AREA = "???????????? ?????????? ...";
    public static final String SARHADDI = "?????????? ????????????";
    public static final String EMAM_KHOMEINI = "?????????? ???????????? ???????? ???????? ??????????";
    public static final String NASTARAN = "?????????? ???????? ?? ????????";
    public static final String CHEHELOHAST_DASTGAH = "48 ????????????";
    public static final String BAHARAN = "?????????? ????????????";
    public static final String MESHKIN_DASHT = "?????????? ??????";
    public static final String MOHAMMAD_SHAHR = "???????? ??????";
    public static final String KHOSHNAM = "????????????";
    public static final String DEHKADE = "??????????";
    public static final String SHAHRAKE_NAZ = "???????? ??????";
    public static final String MANZARIE = "????????????";
    public static final String SHAHRAKE_SADODAH = "???????? 110";
    public static final String SHAHRAKE_TALEGHANI = "???????? ??????????????";
    public static final String BOLVARE_EMAM_REZA = "?????????? ???????? ??????";
    public static final String KHIABAN_EMAM_HOSSEIN = "???????????? ???????? ????????";
    public static final String BOLVARE_BAYAT = "?????????? ????????";
    public static final String POLE_ARTESH = "???? ????????";
    public static final String FALAKE_AVAL = "???????? ??????";
    public static final String FALAKE_DOVOM = "???????? ??????";
    public static final String FALAKE_SEVOM = "???????? ??????";
    public static final String FALAKE_CHAHAROM = "???????? ??????????";
    public static final String FALAKE_PANJOM = "???????? ????????";
    public static final String SHAHRAKE_SEPAH = "???????? ????????";
    public static final String SHAHRAKE_VAHDAT = "???????? ????????";
    public static final String SHAHRAKE_SIMIN_DASHT = "???????? ?????????? ?????????? ??????";
    public static final String SHAHRAK_HAFEZIE = "???????? ????????????";
    public static final String ROKN_ABAD = "?????? ????????";
    public static final String SHAHRAKE_ERAM = "???????? ??????";
    public static final String KHIABAN_AHARI = "???????????? ????????";
    public static final String SHAHRAKE_GOLESTAN = "???????? ????????????";
    public static final String SHAHRAKE_PARNIAN = "???????? ????????????";
    public static final String SHAHRAKE_TABAN = "???????? ??????????";
    public static final String SHAHRAKE_MAHAN = "???????? ??????????";
    public static final String SHAHRAKE_ALZAHRA = "???????? ????????????";
    public static final String SHAHRAKE_PASDAR = "???????? ????????????";
    public static final String NAJAF_ABAD = "?????? ????????";
    public static final String SHAHRAKE_GOLHA = "???????? ????????";
    public static final String KANALE_FARDIS = "?????????? ??????????";
    //.....................................................//

    //Area List ID
    public static final String SELECT_AREA_ID = "0";
    public static final String SARHADDI_ID = "1";
    public static final String EMAM_KHOMEINI_ID = "2";
    public static final String NASTARAN_ID = "3";
    public static final String CHEHELOHAST_DASTGAH_ID = "4";
    public static final String BAHARAN_ID = "5";
    public static final String MESHKIN_DASHT_ID = "6";
    public static final String MOHAMMAD_SHAHR_ID = "7";
    public static final String KHOSHNAM_ID = "8";
    public static final String DEHKADE_ID = "9";
    public static final String SHAHRAKE_NAZ_ID = "10";
    public static final String MANZARIE_ID = "11";
    public static final String SHAHRAKE_SADODAH_ID = "12";
    public static final String SHAHRAKE_TALEGHANI_ID = "13";
    public static final String BOLVARE_EMAM_REZA_ID = "14";
    public static final String KHIABAN_EMAM_HOSSEIN_ID = "15";
    public static final String BOLVARE_BAYAT_ID = "16";
    public static final String POLE_ARTESH_ID = "17";
    public static final String FALAKE_AVAL_ID = "18";
    public static final String FALAKE_DOVOM_ID = "19";
    public static final String FALAKE_SEVOM_ID = "20";
    public static final String FALAKE_CHAHAROM_ID = "21";
    public static final String FALAKE_PANJOM_ID = "22";
    public static final String SHAHRAKE_SEPAH_ID = "23";
    public static final String SHAHRAKE_VAHDAT_ID = "24";
    public static final String SHAHRAKE_SIMIN_DASHT_ID = "25";
    public static final String SHAHRAK_HAFEZIE_ID = "26";
    public static final String ROKN_ABAD_ID = "27";
    public static final String SHAHRAKE_ERAM_ID = "28";
    public static final String KHIABAN_AHARI_ID = "29";
    public static final String SHAHRAKE_GOLESTAN_ID = "30";
    public static final String SHAHRAKE_PARNIAN_ID = "31";
    public static final String SHAHRAKE_TABAN_ID = "32";
    public static final String SHAHRAKE_MAHAN_ID = "33";
    public static final String SHAHRAKE_ALZAHRA_ID = "34";
    public static final String SHAHRAKE_PASDAR_ID = "35";
    public static final String NAJAF_ABAD_ID = "36";
    public static final String SHAHRAKE_GOLHA_ID = "37";
    public static final String KANALE_FARDIS_ID = "38";
    //.....................................................//
}
