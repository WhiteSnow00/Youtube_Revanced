// 
// Decompiled by Procyon v0.6.0
// 

public enum afoj implements agzm
{
    A("CYCLOPS_SHARE", 26, 1001), 
    B("CYCLOPS_RECEIVE", 27, 1002), 
    C("CYCLOPS_DELETE", 28, 1003), 
    D("CYCLOPS_VIEW", 29, 1004), 
    E("CYCLOPS_VIEW_HMD", 30, 1005), 
    F("CYCLOPS_CAPTURE", 31, 1006), 
    G("CYCLOPS_GALLERY_CONTEXT_MENU", 32, 1007), 
    H("CYCLOPS_GALLERY_TO_GALLERY_HMD", 33, 1008), 
    I("CYCLOPS_GALLERY_TO_CAPTURE", 34, 1009), 
    J("CYCLOPS_SETTINGS", 35, 1010), 
    K("CYCLOPS_ACCOUNT_SWITCH", 36, 1011), 
    L("CYCLOPS_FEEDBACK", 37, 1012), 
    M("CYCLOPS_SHARE_START", 38, 1013), 
    N("START_SDK_APPLICATION", 39, 2000), 
    @Deprecated
    O("TRANSITION_HEAD_MOUNT_INSERTED", 40, 2001), 
    @Deprecated
    P("TRANSITION_HEAD_MOUNT_SWITCH", 41, 2002), 
    Q("SDK_PERFORMANCE_REPORT", 42, 2003), 
    R("SDK_SENSOR_REPORT", 43, 2004), 
    S("START_VR_APPLICATION", 44, 2005), 
    T("STOP_VR_APPLICATION", 45, 2006), 
    U("SDK_SCANLINE_RACING_ENABLED", 46, 2007), 
    V("SDK_SCANLINE_RACING_VSYNC_OVERSHOOT_FATAL", 47, 2008), 
    W("SDK_SENSOR_STALL", 48, 2009), 
    X("SDK_DEVICE_IDLE_ON", 49, 2010), 
    Y("SDK_DEVICE_IDLE_OFF", 50, 2011), 
    Z("SDK_PHONE_ALIGNMENT", 51, 2012), 
    a("UNKNOWN_EVENT_TYPE", 0, 0), 
    aA("VRCORE_COMMON_DISABLE_VRMODE", 78, 7001), 
    aB("VRCORE_COMMON_CONTINUE_VRMODE", 79, 7002), 
    aC("VRCORE_COMMON_PERMISSION_GRANTED", 80, 7203), 
    aD("VRCORE_COMMON_PERMISSION_DENIED", 81, 7204), 
    aE("VRCORE_COMMON_CLIENT_DIED", 82, 7048), 
    aF("VRCORE_COMMON_ERROR", 83, 7049), 
    aG("VRCORE_CONTROLLER_CONNECTED", 84, 7050), 
    aH("VRCORE_CONTROLLER_ERROR", 85, 7051), 
    aI("VRCORE_CONTROLLER_OTA_ERROR", 86, 7052), 
    aJ("VRCORE_CONTROLLER_OTA_STARTED", 87, 7053), 
    aK("VRCORE_CONTROLLER_OTA_SUCCESS", 88, 7054), 
    aL("VRCORE_CONTROLLER_OTA_SUCCESS_TRIVIAL", 89, 7055), 
    aM("VRCORE_CONTROLLER_OTA_DATA_TRANSFER_SUCCESS", 90, 7056), 
    aN("VRCORE_CONTROLLER_PAIRING_ERROR", 91, 7057), 
    aO("VRCORE_CONTROLLER_PAIRING_STARTED", 92, 7058), 
    aP("VRCORE_CONTROLLER_PAIRING_SUCCESS", 93, 7059), 
    aQ("VRCORE_CONTROLLER_RECALIBRATED", 94, 7060), 
    aR("VRCORE_CONTROLLER_RECALIBRATION_ERROR", 95, 7061), 
    aS("VRCORE_CONTROLLER_SLEPT_END", 96, 7062), 
    aT("VRCORE_CONTROLLER_SLEPT_IDLE", 97, 7063), 
    aU("VRCORE_CONTROLLER_VOLUME_ADJUSTED", 98, 7064), 
    aV("VRCORE_CONTROLLER_EMULATOR_CONNECTED", 99, 7065), 
    aW("VRCORE_CONTROLLER_EMULATOR_ERROR", 100, 7066), 
    aX("VRCORE_CONTROLLER_RAIL_REPORT", 101, 7067), 
    aY("VRCORE_CONTROLLER_STUCK_NOTIFICATION_SHOWN", 102, 7068), 
    aZ("VRCORE_CONTROLLER_STUCK_EXITED_VR", 103, 7069), 
    aa("SDK_SET_EXTERNAL_SURFACE", 52, 2013), 
    ab("PERFORMANCE_OVERLAY_ENABLED", 53, 2014), 
    ac("PERFORMANCE_OVERLAY_DISABLED", 54, 2015), 
    ad("SDK_GRAPHICS_REPORT", 55, 2016), 
    ae("SDK_COMPOSITOR_INITIALIZED", 56, 2017), 
    @Deprecated
    af("START_VR_LAUNCHER_COLD", 57, 3000), 
    ag("LAUNCHER_START_APPLICATION", 58, 3001), 
    ah("LAUNCHER_STOP_APPLICATION", 59, 3002), 
    ai("AUDIO_INITIALIZATION", 60, 4000), 
    aj("AUDIO_SHUTDOWN", 61, 4001), 
    ak("AUDIO_PERFORMANCE_REPORT", 62, 4002), 
    al("LULLABY_MUTE", 63, 5000), 
    am("LULLABY_UNMUTE", 64, 5001), 
    an("LULLABY_IMPRESSION", 65, 5002), 
    ao("LULLABY_ACTION", 66, 5003), 
    ap("LULLABY_LOAD", 67, 5004), 
    aq("EMBEDVR_START_SESSION", 68, 6000), 
    ar("EMBEDVR_STOP_SESSION", 69, 6001), 
    as("EMBEDVR_LOAD_SUCCESS", 70, 6002), 
    at("EMBEDVR_LOAD_ERROR", 71, 6003), 
    au("EMBEDVR_VIEW_CLICK", 72, 6004), 
    av("EMBEDVR_VIDEO_PLAY", 73, 6005), 
    aw("EMBEDVR_VIDEO_PAUSE", 74, 6006), 
    ax("EMBEDVR_VIDEO_SEEK_TO", 75, 6007), 
    ay("EMBEDVR_PERFORMANCE_REPORT", 76, 6008), 
    az("VRCORE_COMMON_ENABLE_VRMODE", 77, 7000), 
    b("START_LAUNCHER", 1, 1), 
    bA("VRCORE_CAPTURE_START_CASTING", 130, 7351), 
    bB("VRCORE_CAPTURE_STOP_CASTING", 131, 7352), 
    bC("VRCORE_CAPTURE_STOP_CASTING_ON_DOFF", 132, 7356), 
    bD("VRCORE_CAPTURE_SAVING_SCREENSHOT", 133, 7353), 
    bE("VRCORE_CAPTURE_STARTING_VIDEO_RECORDING", 134, 7354), 
    bF("VRCORE_CAPTURE_STOPPING_VIDEO_RECORDING", 135, 7355), 
    bG("VRCORE_CAPTURE_REQUESTING_FS_PERMISSION", 136, 7357), 
    bH("VRCORE_CAPTURE_FS_PERMISSION_GRANTED", 137, 7358), 
    bI("VRCORE_CAPTURE_FS_PERMISSION_DENIED", 138, 7359), 
    bJ("VRCORE_LOCK_SCREEN_EVENT", 139, 7995), 
    bK("VRCORE_HEAD_TRACKING_REPORT", 140, 7996), 
    bL("VRCORE_GRAPHICS_REPORT", 141, 7997), 
    bM("VRCORE_DASHBOARD_EVENT", 142, 7998), 
    bN("VRCORE_PERFORMANCE_REPORT", 143, 7999), 
    bO("EARTHVR_APP_STARTED", 144, 8000), 
    bP("EARTHVR_APP_STOPPED", 145, 8001), 
    bQ("EARTHVR_APP_IDLE", 146, 8002), 
    bR("EARTHVR_APP_MODE_ENTERED", 147, 8003), 
    bS("EARTHVR_APP_MODE_EXITED", 148, 8004), 
    bT("EARTHVR_APP_PREFERENCES_CHANGED", 149, 8005), 
    bU("EARTHVR_APP_ENVIRONMENT_CHANGED", 150, 8006), 
    bV("EARTHVR_APP_INITIALIZED", 151, 8007), 
    bW("EARTHVR_APP_SDK_FORCED_SHUTDOWN", 152, 8008), 
    bX("EARTHVR_FORCE_HUMAN_SCALE_CHANGED", 153, 8009), 
    bY("EARTHVR_NAVIGATION_ARCBALL_STARTED", 154, 8100), 
    bZ("EARTHVR_NAVIGATION_ARCBALL_UPDATED", 155, 8101), 
    ba("VRCORE_CONTROLLER_STUCK_NOTIFICATION_TAPPED", 104, 7070), 
    bb("VRCORE_CONTROLLER_OTA_DATA_TRANSFER_STARTED", 105, 7071), 
    bc("VRCORE_CONTROLLER_RECOVERY_MODE", 106, 7072), 
    bd("VRCORE_CONTROLLER_SLODR_DETECTED", 107, 7073), 
    be("VRCORE_CONTROLLER_HANDEDNESS_SWITCHED", 108, 7074), 
    bf("VRCORE_CONTROLLER_DISCONNECTED", 109, 7075), 
    bg("VRCORE_NFC_TRIGGER_INTENT", 110, 7100), 
    bh("VRCORE_NFC_ERROR", 111, 7149), 
    bi("VRCORE_NOTIFICATION_POSTED", 112, 7150), 
    bj("VRCORE_NOTIFICATION_REMOVED", 113, 7151), 
    bk("VRCORE_NOTIFICATION_ERROR", 114, 7199), 
    bl("VRCORE_SETTINGS_LAUNCHED", 115, 7200), 
    bm("VRCORE_SETTINGS_ENABLE_NOTIFICATION", 116, 7201), 
    bn("VRCORE_SETTINGS_DISABLE_NOTIFICATION", 117, 7202), 
    bo("VRCORE_SETTINGS_ERROR", 118, 7249), 
    bp("VRCORE_DAYDREAM_DON_STARTED", 119, 7250), 
    bq("VRCORE_DAYDREAM_DON_SUCCESS", 120, 7251), 
    br("VRCORE_DAYDREAM_DON_ERROR", 121, 7252), 
    bs("VRCORE_DAYDREAM_SESSION_STARTED", 122, 7253), 
    bt("VRCORE_DAYDREAM_SESSION_ENDED", 123, 7254), 
    bu("VRCORE_DAYDREAM_HOME_LAUNCHED", 124, 7255), 
    bv("VRCORE_DAYDREAM_METAWORLD_STARTED", 125, 7256), 
    bw("VRCORE_DAYDREAM_METAWORLD_DISMISSED", 126, 7257), 
    bx("VRCORE_DAYDREAM_SYSTEM_UPDATE_ACCEPTED", 127, 7258), 
    by("VRCORE_DAYDREAM_SYSTEM_UPDATE_DECLINED", 128, 7259), 
    bz("VRCORE_CAPTURE_ERROR", 129, 7350), 
    c("GET_INSTALLED_APPLICATIONS", 2, 2), 
    cA("EARTHVR_SEARCH_PIN_DISMISSED", 182, 8312), 
    cB("EARTHVR_SEARCH_PIN_EXPIRED", 183, 8313), 
    cC("EARTHVR_MENU_COPYRIGHT_OPENED", 184, 8314), 
    cD("EARTHVR_MENU_COPYRIGHT_CLOSED", 185, 8315), 
    cE("EARTHVR_TOUR_PAUSED", 186, 8400), 
    cF("EARTHVR_TOUR_RESUMED", 187, 8401), 
    cG("EARTHVR_TOUR_COMPLETED", 188, 8402), 
    cH("EARTHVR_TUTORIAL_STAGE_CHANGED", 189, 8403), 
    cI("EARTHVR_TOUR_STARTED", 190, 8404), 
    cJ("EARTHVR_SPLASH_SCREEN_EXITED", 191, 8405), 
    cK("EARTHVR_PLACE_SAVED", 192, 8500), 
    cL("EARTHVR_REVEAL_QUERY_STARTED", 193, 8501), 
    cM("EARTHVR_REVEAL_QUERY_RESULT_READY", 194, 8502), 
    @Deprecated
    cN("EARTHVR_MINIGLOBE_BECAME_LARGE", 195, 8503), 
    @Deprecated
    cO("EARTHVR_MINIGLOBE_BECAME_SMALL", 196, 8504), 
    cP("EARTHVR_MINIGLOBE_ROTATED", 197, 8505), 
    cQ("EARTHVR_MINIGLOBE_TELEPORT_TRIGGERED", 198, 8506), 
    cR("EARTHVR_ACTION_ORB_EXPANSION_STATE_CHANGED", 199, 8507), 
    cS("EARTHVR_ACTION_ORB_DISPLAY_MODE_CHANGED", 200, 8508), 
    cT("EARTHVR_STREET_VIEW_STATE_CHANGED", 201, 8550), 
    cU("EARTHVR_STREET_VIEW_PANO_PREVIEW_LOADED", 202, 8551), 
    cV("EARTHVR_STREET_VIEW_PANO_HI_RES_PREVIEW_LOADED", 203, 8552), 
    cW("EARTHVR_STREET_VIEW_PANO_MIRTH_LOADED", 204, 8553), 
    cX("EARTHVR_STREET_VIEW_USER_DISCOVERED_NEIGHBOR", 205, 8554), 
    cY("KEYBOARD_EVENT", 206, 9000), 
    cZ("STREET_VIEW_COLLECTION", 207, 10000), 
    ca("EARTHVR_NAVIGATION_ARCBALL_STOPPED", 156, 8102), 
    cb("EARTHVR_NAVIGATION_FLYING_STARTED", 157, 8103), 
    cc("EARTHVR_NAVIGATION_FLYING_UPDATED", 158, 8104), 
    cd("EARTHVR_NAVIGATION_FLYING_STOPPED", 159, 8105), 
    ce("EARTHVR_NAVIGATION_SKY_TIME_TRAVELING_STARTED", 160, 8106), 
    cf("EARTHVR_NAVIGATION_SKY_TIME_TRAVELING_UPDATED", 161, 8107), 
    cg("EARTHVR_NAVIGATION_SKY_TIME_TRAVELING_STOPPED", 162, 8108), 
    ch("EARTHVR_NAVIGATION_ROTATING_STARTED", 163, 8109), 
    ci("EARTHVR_NAVIGATION_ROTATING_UPDATED", 164, 8110), 
    cj("EARTHVR_NAVIGATION_ROTATING_STOPPED", 165, 8111), 
    ck("EARTHVR_NAVIGATION_TRANSITION_STARTED", 166, 8150), 
    cl("EARTHVR_NAVIGATION_TRANSITION_STOPPED", 167, 8151), 
    cm("EARTHVR_RENDERING_TUNNEL_VISION_APPEARED", 168, 8200), 
    cn("EARTHVR_RENDERING_TUNNEL_VISION_DISAPPEARED", 169, 8201), 
    co("EARTHVR_MENU_OPENED", 170, 8300), 
    cp("EARTHVR_MENU_CLOSED", 171, 8301), 
    cq("EARTHVR_MENU_PREFERENCES_OPENED", 172, 8302), 
    cr("EARTHVR_MENU_PREFERENCES_CLOSED", 173, 8303), 
    cs("EARTHVR_MENU_CATEGORY_SELECTED", 174, 8304), 
    ct("EARTHVR_MENU_PAGE_CHANGED", 175, 8305), 
    cu("EARTHVR_MENU_CARD_CLICKED", 176, 8306), 
    cv("EARTHVR_MENU_PLACE_DELETION_REQUESTED", 177, 8307), 
    cw("EARTHVR_DESKTOP_WINDOW_MENU_ITEM_SELECTED", 178, 8308), 
    cx("EARTHVR_SEARCH_OPENED", 179, 8309), 
    cy("EARTHVR_SEARCH_CLOSED", 180, 8310), 
    cz("EARTHVR_SEARCH_ENTITY_SELECTED", 181, 8311), 
    d("START_APPLICATION", 3, 3), 
    dA("PHOTOS_BACKUP_CARD_SHOWN", 234, 11050), 
    dB("PHOTOS_BACKUP_CARD_DISMISS", 235, 11051), 
    dC("PHOTOS_BACKUP_CARD_SUCCESS", 236, 11052), 
    dD("PHOTOS_SIGN_CARD_SHOWN", 237, 11060), 
    dE("PHOTOS_WARM_WELCOME_SHOWN", 238, 11061), 
    @Deprecated
    dF("VRHOME_SETUP_STEP_START", 239, 12000), 
    @Deprecated
    dG("VRHOME_SETUP_STEP_END", 240, 12001), 
    @Deprecated
    dH("VRHOME_SETUP_STEP_STATE_CHANGE", 241, 12002), 
    @Deprecated
    dI("VRHOME_GCONFIG_UPDATED", 242, 12003), 
    @Deprecated
    dJ("VRHOME_GET_VIEWER_CLICK", 243, 12004), 
    @Deprecated
    dK("VRHOME_DIALOG_ACTION", 244, 12005), 
    dL("JUMP_INSPECTOR_APP_STARTED", 245, 13000), 
    dM("JUMP_INSPECTOR_PLAYBACK", 246, 13001), 
    dN("JUMP_INSPECTOR_PICKER", 247, 13002), 
    dO("JUMP_INSPECTOR_OPEN_SETTINGS", 248, 13003), 
    dP("JUMP_INSPECTOR_ADD_TO_HOME_SCREEN", 249, 13004), 
    dQ("JUMP_INSPECTOR_OPEN_FAQ", 250, 13005), 
    dR("JUMP_INSPECTOR_ERROR", 251, 13006), 
    dS("STREAMING_APP_START", 252, 14000), 
    dT("STREAMING_FRAMES", 253, 14001), 
    dU("TOUR_STARTED", 254, 15000), 
    dV("TOUR_ENDED", 255, 15001), 
    dW("TANGO_6DOF_FAILURE", 256, 16000), 
    dX("TANGO_6DOF_RECOVERY", 257, 16001), 
    dY("TANGO_FLOOR_HEIGHT_CHANGE", 258, 16002), 
    dZ("STANDALONE_POWER_STATE", 259, 17000), 
    da("STREET_VIEW_PANO_IN_COLLECTION", 208, 10001), 
    db("STREET_VIEW_PANO_IN_SEARCH_RESULTS", 209, 10002), 
    dc("STREET_VIEW_NO_KEYBOARD", 210, 10003), 
    dd("STREET_VIEW_SEARCH_START", 211, 10004), 
    de("STREET_VIEW_SEARCH_RESULTS", 212, 10005), 
    df("STREET_VIEW_SEARCH_NO_RESULTS", 213, 10006), 
    dg("STREET_VIEW_SEARCH_DISMISS", 214, 10007), 
    dh("STREET_VIEW_SEARCH_EDIT", 215, 10008), 
    di("STREET_VIEW_PANO_NAV_SESSION", 216, 10009), 
    dj("STREET_VIEW_APP_BUTTON", 217, 10010), 
    dk("STREET_VIEW_SEARCH_NO_PANOS", 218, 10011), 
    dl("STREET_VIEW_SEARCH_REQUIRES_GMS_CORE_UPDATE", 219, 10012), 
    dm("STREET_VIEW_TUTORIAL_SESSION", 220, 10013), 
    dn("PHOTOS_APPLICATION", 221, 11000), 
    do("PHOTOS_GALLERY_NEXT", 222, 11010), 
    dp("PHOTOS_GALLERY_PREV", 223, 11011), 
    dq("PHOTOS_GALLERY_SCRUB_DRAG", 224, 11012), 
    dr("PHOTOS_GALLERY_TAB_CHANGE", 225, 11013), 
    ds("PHOTOS_ACCOUNT_CHANGE", 226, 11020), 
    dt("PHOTOS_ACCOUNT_INVALID", 227, 11021), 
    du("PHOTOS_OPEN_MEDIA", 228, 11030), 
    dv("PHOTOS_CAROUSEL_NEXT", 229, 11031), 
    dw("PHOTOS_CAROUSEL_PREV", 230, 11032), 
    dx("PHOTOS_CC_CARD_SHOWN", 231, 11040), 
    dy("PHOTOS_CC_CARD_DISMISS", 232, 11041), 
    dz("PHOTOS_CC_CARD_SUCCESS", 233, 11042), 
    e("STOP_APPLICATION", 4, 4), 
    eA("VR180_CREATOR_PHOTO_MERGE", 286, 19004), 
    eB("VR180_CREATOR_PHOTO_CONVERT", 287, 19005), 
    eC("VR180_CREATOR_VIDEO_STITCH", 288, 19006), 
    ea("STANDALONE_MEMORY_STATS", 260, 17001), 
    eb("STANDALONE_HEADSET_ON", 261, 17002), 
    ec("STANDALONE_HEADSET_OFF", 262, 17003), 
    ed("STANDALONE_IDLE_ENTER", 263, 17004), 
    ee("STANDALONE_IDLE_EXIT", 264, 17005), 
    ef("STANDALONE_IDLE_SHOW_WARNING", 265, 17006), 
    eg("STANDALONE_IDLE_WARNING_DISMISSED", 266, 17007), 
    eh("EVA_APPLICATION", 267, 18000), 
    ei("EVA_PAIRING", 268, 18001), 
    ej("EVA_CAPTURE", 269, 18002), 
    ek("EVA_FILE_TRANSFER", 270, 18003), 
    el("EVA_VIEW", 271, 18004), 
    em("EVA_CAMERA_STATUS", 272, 18005), 
    en("EVA_BLUETOOTH_SESSION", 273, 18006), 
    eo("EVA_WIFI_SETUP_SESSION", 274, 18007), 
    ep("EVA_SHARE", 275, 18008), 
    eq("EVA_CAMERA_CRASH", 276, 18009), 
    er("EVA_DELETE", 277, 18010), 
    es("EVA_WIGGLEGRAM_GENERATED", 278, 18011), 
    et("EVA_EXPORT_MEDIA", 279, 18012), 
    eu("EVA_CAMERA_FIRMWARE_UPDATE", 280, 18013), 
    ev("EVA_SELECTION_ACTION", 281, 18014), 
    ew("VR180_CREATOR_START", 282, 19000), 
    ex("VR180_CREATOR_VIDEO_CONVERT", 283, 19001), 
    ey("VR180_CREATOR_VIDEO_PUBLISH", 284, 19002), 
    ez("VR180_CREATOR_PHOTO_SPLIT", 285, 19003), 
    f("GO_TO_STORE", 5, 5), 
    g("SWITCH_HEAD_MOUNT", 6, 6), 
    h("SETUP_WELCOME_NEXT", 7, 11), 
    i("SETUP_WELCOME_GET_VIEWER", 8, 12), 
    j("SETUP_WELCOME_SWITCH_VIEWER", 9, 13), 
    k("SETUP_WELCOME_USE_VIEWER", 10, 14), 
    l("SETUP_QR_CODE_SCAN_SKIP", 11, 7), 
    m("SETUP_QR_CODE_SCAN", 12, 8), 
    n("SETUP_QR_CODE_HELP", 13, 15), 
    o("SETUP_PAIRED_NEXT", 14, 16), 
    p("SETUP_HEAD_MOUNT_INSERTED", 15, 17), 
    q("SETUP_HEAD_MOUNT_SWITCH", 16, 18), 
    r("SETUP_VR_INTRO_START", 17, 19), 
    s("SETUP_VR_INTRO_STOP", 18, 20), 
    t("SETTINGS_QR_CODE_SCAN", 19, 9), 
    u("SETTINGS_QR_CODE_SCAN_SKIP", 20, 10), 
    v("SETTINGS_QR_CODE_HELP", 21, 21), 
    w("MY_APPS_TAB", 22, 22), 
    x("FEATURED_APPS_TAB", 23, 23), 
    y("NAV_ITEM_SELECTED", 24, 24), 
    z("CYCLOPS_APPLICATION", 25, 1000);
    
    public final int eD;
    
    private afoj(final String s, final int n, final int ed) {
        this.eD = ed;
    }
    
    public static afoj a(final int n) {
        switch (n) {
            default: {
                switch (n) {
                    default: {
                        switch (n) {
                            default: {
                                switch (n) {
                                    default: {
                                        switch (n) {
                                            default: {
                                                switch (n) {
                                                    default: {
                                                        switch (n) {
                                                            default: {
                                                                switch (n) {
                                                                    default: {
                                                                        switch (n) {
                                                                            default: {
                                                                                switch (n) {
                                                                                    default: {
                                                                                        return null;
                                                                                    }
                                                                                    case 7151: {
                                                                                        return afoj.bj;
                                                                                    }
                                                                                    case 7150: {
                                                                                        return afoj.bi;
                                                                                    }
                                                                                    case 7149: {
                                                                                        return afoj.bh;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                            case 19006: {
                                                                                return afoj.eC;
                                                                            }
                                                                            case 19005: {
                                                                                return afoj.eB;
                                                                            }
                                                                            case 19004: {
                                                                                return afoj.eA;
                                                                            }
                                                                            case 19003: {
                                                                                return afoj.ez;
                                                                            }
                                                                            case 19002: {
                                                                                return afoj.ey;
                                                                            }
                                                                            case 19001: {
                                                                                return afoj.ex;
                                                                            }
                                                                            case 19000: {
                                                                                return afoj.ew;
                                                                            }
                                                                            case 18014: {
                                                                                return afoj.ev;
                                                                            }
                                                                            case 18013: {
                                                                                return afoj.eu;
                                                                            }
                                                                            case 18012: {
                                                                                return afoj.et;
                                                                            }
                                                                            case 18011: {
                                                                                return afoj.es;
                                                                            }
                                                                            case 18010: {
                                                                                return afoj.er;
                                                                            }
                                                                            case 18009: {
                                                                                return afoj.eq;
                                                                            }
                                                                            case 18008: {
                                                                                return afoj.ep;
                                                                            }
                                                                            case 18007: {
                                                                                return afoj.eo;
                                                                            }
                                                                            case 18006: {
                                                                                return afoj.en;
                                                                            }
                                                                            case 18005: {
                                                                                return afoj.em;
                                                                            }
                                                                            case 18004: {
                                                                                return afoj.el;
                                                                            }
                                                                            case 18003: {
                                                                                return afoj.ek;
                                                                            }
                                                                            case 18002: {
                                                                                return afoj.ej;
                                                                            }
                                                                            case 18001: {
                                                                                return afoj.ei;
                                                                            }
                                                                            case 18000: {
                                                                                return afoj.eh;
                                                                            }
                                                                            case 17007: {
                                                                                return afoj.eg;
                                                                            }
                                                                            case 17006: {
                                                                                return afoj.ef;
                                                                            }
                                                                            case 17005: {
                                                                                return afoj.ee;
                                                                            }
                                                                            case 17004: {
                                                                                return afoj.ed;
                                                                            }
                                                                            case 17003: {
                                                                                return afoj.ec;
                                                                            }
                                                                            case 17002: {
                                                                                return afoj.eb;
                                                                            }
                                                                            case 17001: {
                                                                                return afoj.ea;
                                                                            }
                                                                            case 17000: {
                                                                                return afoj.dZ;
                                                                            }
                                                                            case 16002: {
                                                                                return afoj.dY;
                                                                            }
                                                                            case 16001: {
                                                                                return afoj.dX;
                                                                            }
                                                                            case 16000: {
                                                                                return afoj.dW;
                                                                            }
                                                                            case 15001: {
                                                                                return afoj.dV;
                                                                            }
                                                                            case 15000: {
                                                                                return afoj.dU;
                                                                            }
                                                                            case 14001: {
                                                                                return afoj.dT;
                                                                            }
                                                                            case 14000: {
                                                                                return afoj.dS;
                                                                            }
                                                                            case 13006: {
                                                                                return afoj.dR;
                                                                            }
                                                                            case 13005: {
                                                                                return afoj.dQ;
                                                                            }
                                                                            case 13004: {
                                                                                return afoj.dP;
                                                                            }
                                                                            case 13003: {
                                                                                return afoj.dO;
                                                                            }
                                                                            case 13002: {
                                                                                return afoj.dN;
                                                                            }
                                                                            case 13001: {
                                                                                return afoj.dM;
                                                                            }
                                                                            case 13000: {
                                                                                return afoj.dL;
                                                                            }
                                                                            case 12005: {
                                                                                return afoj.dK;
                                                                            }
                                                                            case 12004: {
                                                                                return afoj.dJ;
                                                                            }
                                                                            case 12003: {
                                                                                return afoj.dI;
                                                                            }
                                                                            case 12002: {
                                                                                return afoj.dH;
                                                                            }
                                                                            case 12001: {
                                                                                return afoj.dG;
                                                                            }
                                                                            case 12000: {
                                                                                return afoj.dF;
                                                                            }
                                                                            case 11061: {
                                                                                return afoj.dE;
                                                                            }
                                                                            case 11060: {
                                                                                return afoj.dD;
                                                                            }
                                                                            case 11052: {
                                                                                return afoj.dC;
                                                                            }
                                                                            case 11051: {
                                                                                return afoj.dB;
                                                                            }
                                                                            case 11050: {
                                                                                return afoj.dA;
                                                                            }
                                                                            case 11042: {
                                                                                return afoj.dz;
                                                                            }
                                                                            case 11041: {
                                                                                return afoj.dy;
                                                                            }
                                                                            case 11040: {
                                                                                return afoj.dx;
                                                                            }
                                                                            case 11032: {
                                                                                return afoj.dw;
                                                                            }
                                                                            case 11031: {
                                                                                return afoj.dv;
                                                                            }
                                                                            case 11030: {
                                                                                return afoj.du;
                                                                            }
                                                                            case 11021: {
                                                                                return afoj.dt;
                                                                            }
                                                                            case 11020: {
                                                                                return afoj.ds;
                                                                            }
                                                                            case 11013: {
                                                                                return afoj.dr;
                                                                            }
                                                                            case 11012: {
                                                                                return afoj.dq;
                                                                            }
                                                                            case 11011: {
                                                                                return afoj.dp;
                                                                            }
                                                                            case 11010: {
                                                                                return afoj.do;
                                                                            }
                                                                            case 11000: {
                                                                                return afoj.dn;
                                                                            }
                                                                            case 10013: {
                                                                                return afoj.dm;
                                                                            }
                                                                            case 10012: {
                                                                                return afoj.dl;
                                                                            }
                                                                            case 10011: {
                                                                                return afoj.dk;
                                                                            }
                                                                            case 10010: {
                                                                                return afoj.dj;
                                                                            }
                                                                            case 10009: {
                                                                                return afoj.di;
                                                                            }
                                                                            case 10008: {
                                                                                return afoj.dh;
                                                                            }
                                                                            case 10007: {
                                                                                return afoj.dg;
                                                                            }
                                                                            case 10006: {
                                                                                return afoj.df;
                                                                            }
                                                                            case 10005: {
                                                                                return afoj.de;
                                                                            }
                                                                            case 10004: {
                                                                                return afoj.dd;
                                                                            }
                                                                            case 10003: {
                                                                                return afoj.dc;
                                                                            }
                                                                            case 10002: {
                                                                                return afoj.db;
                                                                            }
                                                                            case 10001: {
                                                                                return afoj.da;
                                                                            }
                                                                            case 10000: {
                                                                                return afoj.cZ;
                                                                            }
                                                                            case 9000: {
                                                                                return afoj.cY;
                                                                            }
                                                                            case 8554: {
                                                                                return afoj.cX;
                                                                            }
                                                                            case 8553: {
                                                                                return afoj.cW;
                                                                            }
                                                                            case 8552: {
                                                                                return afoj.cV;
                                                                            }
                                                                            case 8551: {
                                                                                return afoj.cU;
                                                                            }
                                                                            case 8550: {
                                                                                return afoj.cT;
                                                                            }
                                                                            case 8508: {
                                                                                return afoj.cS;
                                                                            }
                                                                            case 8507: {
                                                                                return afoj.cR;
                                                                            }
                                                                            case 8506: {
                                                                                return afoj.cQ;
                                                                            }
                                                                            case 8505: {
                                                                                return afoj.cP;
                                                                            }
                                                                            case 8504: {
                                                                                return afoj.cO;
                                                                            }
                                                                            case 8503: {
                                                                                return afoj.cN;
                                                                            }
                                                                            case 8502: {
                                                                                return afoj.cM;
                                                                            }
                                                                            case 8501: {
                                                                                return afoj.cL;
                                                                            }
                                                                            case 8500: {
                                                                                return afoj.cK;
                                                                            }
                                                                            case 8405: {
                                                                                return afoj.cJ;
                                                                            }
                                                                            case 8404: {
                                                                                return afoj.cI;
                                                                            }
                                                                            case 8403: {
                                                                                return afoj.cH;
                                                                            }
                                                                            case 8402: {
                                                                                return afoj.cG;
                                                                            }
                                                                            case 8401: {
                                                                                return afoj.cF;
                                                                            }
                                                                            case 8400: {
                                                                                return afoj.cE;
                                                                            }
                                                                            case 8315: {
                                                                                return afoj.cD;
                                                                            }
                                                                            case 8314: {
                                                                                return afoj.cC;
                                                                            }
                                                                            case 8313: {
                                                                                return afoj.cB;
                                                                            }
                                                                            case 8312: {
                                                                                return afoj.cA;
                                                                            }
                                                                            case 8311: {
                                                                                return afoj.cz;
                                                                            }
                                                                            case 8310: {
                                                                                return afoj.cy;
                                                                            }
                                                                            case 8309: {
                                                                                return afoj.cx;
                                                                            }
                                                                            case 8308: {
                                                                                return afoj.cw;
                                                                            }
                                                                            case 8307: {
                                                                                return afoj.cv;
                                                                            }
                                                                            case 8306: {
                                                                                return afoj.cu;
                                                                            }
                                                                            case 8305: {
                                                                                return afoj.ct;
                                                                            }
                                                                            case 8304: {
                                                                                return afoj.cs;
                                                                            }
                                                                            case 8303: {
                                                                                return afoj.cr;
                                                                            }
                                                                            case 8302: {
                                                                                return afoj.cq;
                                                                            }
                                                                            case 8301: {
                                                                                return afoj.cp;
                                                                            }
                                                                            case 8300: {
                                                                                return afoj.co;
                                                                            }
                                                                            case 8201: {
                                                                                return afoj.cn;
                                                                            }
                                                                            case 8200: {
                                                                                return afoj.cm;
                                                                            }
                                                                            case 8151: {
                                                                                return afoj.cl;
                                                                            }
                                                                            case 8150: {
                                                                                return afoj.ck;
                                                                            }
                                                                            case 8111: {
                                                                                return afoj.cj;
                                                                            }
                                                                            case 8110: {
                                                                                return afoj.ci;
                                                                            }
                                                                            case 8109: {
                                                                                return afoj.ch;
                                                                            }
                                                                            case 8108: {
                                                                                return afoj.cg;
                                                                            }
                                                                            case 8107: {
                                                                                return afoj.cf;
                                                                            }
                                                                            case 8106: {
                                                                                return afoj.ce;
                                                                            }
                                                                            case 8105: {
                                                                                return afoj.cd;
                                                                            }
                                                                            case 8104: {
                                                                                return afoj.cc;
                                                                            }
                                                                            case 8103: {
                                                                                return afoj.cb;
                                                                            }
                                                                            case 8102: {
                                                                                return afoj.ca;
                                                                            }
                                                                            case 8101: {
                                                                                return afoj.bZ;
                                                                            }
                                                                            case 8100: {
                                                                                return afoj.bY;
                                                                            }
                                                                            case 8009: {
                                                                                return afoj.bX;
                                                                            }
                                                                            case 8008: {
                                                                                return afoj.bW;
                                                                            }
                                                                            case 8007: {
                                                                                return afoj.bV;
                                                                            }
                                                                            case 8006: {
                                                                                return afoj.bU;
                                                                            }
                                                                            case 8005: {
                                                                                return afoj.bT;
                                                                            }
                                                                            case 8004: {
                                                                                return afoj.bS;
                                                                            }
                                                                            case 8003: {
                                                                                return afoj.bR;
                                                                            }
                                                                            case 8002: {
                                                                                return afoj.bQ;
                                                                            }
                                                                            case 8001: {
                                                                                return afoj.bP;
                                                                            }
                                                                            case 8000: {
                                                                                return afoj.bO;
                                                                            }
                                                                            case 7999: {
                                                                                return afoj.bN;
                                                                            }
                                                                            case 7998: {
                                                                                return afoj.bM;
                                                                            }
                                                                            case 7997: {
                                                                                return afoj.bL;
                                                                            }
                                                                            case 7996: {
                                                                                return afoj.bK;
                                                                            }
                                                                            case 7995: {
                                                                                return afoj.bJ;
                                                                            }
                                                                            case 7359: {
                                                                                return afoj.bI;
                                                                            }
                                                                            case 7358: {
                                                                                return afoj.bH;
                                                                            }
                                                                            case 7357: {
                                                                                return afoj.bG;
                                                                            }
                                                                            case 7356: {
                                                                                return afoj.bC;
                                                                            }
                                                                            case 7355: {
                                                                                return afoj.bF;
                                                                            }
                                                                            case 7354: {
                                                                                return afoj.bE;
                                                                            }
                                                                            case 7353: {
                                                                                return afoj.bD;
                                                                            }
                                                                            case 7352: {
                                                                                return afoj.bB;
                                                                            }
                                                                            case 7351: {
                                                                                return afoj.bA;
                                                                            }
                                                                            case 7350: {
                                                                                return afoj.bz;
                                                                            }
                                                                            case 7259: {
                                                                                return afoj.by;
                                                                            }
                                                                            case 7258: {
                                                                                return afoj.bx;
                                                                            }
                                                                            case 7257: {
                                                                                return afoj.bw;
                                                                            }
                                                                            case 7256: {
                                                                                return afoj.bv;
                                                                            }
                                                                            case 7255: {
                                                                                return afoj.bu;
                                                                            }
                                                                            case 7254: {
                                                                                return afoj.bt;
                                                                            }
                                                                            case 7253: {
                                                                                return afoj.bs;
                                                                            }
                                                                            case 7252: {
                                                                                return afoj.br;
                                                                            }
                                                                            case 7251: {
                                                                                return afoj.bq;
                                                                            }
                                                                            case 7250: {
                                                                                return afoj.bp;
                                                                            }
                                                                            case 7249: {
                                                                                return afoj.bo;
                                                                            }
                                                                            case 7204: {
                                                                                return afoj.aD;
                                                                            }
                                                                            case 7203: {
                                                                                return afoj.aC;
                                                                            }
                                                                            case 7202: {
                                                                                return afoj.bn;
                                                                            }
                                                                            case 7201: {
                                                                                return afoj.bm;
                                                                            }
                                                                            case 7200: {
                                                                                return afoj.bl;
                                                                            }
                                                                            case 7199: {
                                                                                return afoj.bk;
                                                                            }
                                                                            case 7100: {
                                                                                return afoj.bg;
                                                                            }
                                                                            case 7075: {
                                                                                return afoj.bf;
                                                                            }
                                                                            case 7074: {
                                                                                return afoj.be;
                                                                            }
                                                                            case 7073: {
                                                                                return afoj.bd;
                                                                            }
                                                                            case 7072: {
                                                                                return afoj.bc;
                                                                            }
                                                                            case 7071: {
                                                                                return afoj.bb;
                                                                            }
                                                                            case 7070: {
                                                                                return afoj.ba;
                                                                            }
                                                                            case 7069: {
                                                                                return afoj.aZ;
                                                                            }
                                                                            case 7068: {
                                                                                return afoj.aY;
                                                                            }
                                                                            case 7067: {
                                                                                return afoj.aX;
                                                                            }
                                                                            case 7066: {
                                                                                return afoj.aW;
                                                                            }
                                                                            case 7065: {
                                                                                return afoj.aV;
                                                                            }
                                                                            case 7064: {
                                                                                return afoj.aU;
                                                                            }
                                                                            case 7063: {
                                                                                return afoj.aT;
                                                                            }
                                                                            case 7062: {
                                                                                return afoj.aS;
                                                                            }
                                                                            case 7061: {
                                                                                return afoj.aR;
                                                                            }
                                                                            case 7060: {
                                                                                return afoj.aQ;
                                                                            }
                                                                            case 7059: {
                                                                                return afoj.aP;
                                                                            }
                                                                            case 7058: {
                                                                                return afoj.aO;
                                                                            }
                                                                            case 7057: {
                                                                                return afoj.aN;
                                                                            }
                                                                            case 7056: {
                                                                                return afoj.aM;
                                                                            }
                                                                            case 7055: {
                                                                                return afoj.aL;
                                                                            }
                                                                            case 7054: {
                                                                                return afoj.aK;
                                                                            }
                                                                            case 7053: {
                                                                                return afoj.aJ;
                                                                            }
                                                                            case 7052: {
                                                                                return afoj.aI;
                                                                            }
                                                                            case 7051: {
                                                                                return afoj.aH;
                                                                            }
                                                                            case 7050: {
                                                                                return afoj.aG;
                                                                            }
                                                                            case 7049: {
                                                                                return afoj.aF;
                                                                            }
                                                                            case 7048: {
                                                                                return afoj.aE;
                                                                            }
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 7002: {
                                                                        return afoj.aB;
                                                                    }
                                                                    case 7001: {
                                                                        return afoj.aA;
                                                                    }
                                                                    case 7000: {
                                                                        return afoj.az;
                                                                    }
                                                                }
                                                                break;
                                                            }
                                                            case 6008: {
                                                                return afoj.ay;
                                                            }
                                                            case 6007: {
                                                                return afoj.ax;
                                                            }
                                                            case 6006: {
                                                                return afoj.aw;
                                                            }
                                                            case 6005: {
                                                                return afoj.av;
                                                            }
                                                            case 6004: {
                                                                return afoj.au;
                                                            }
                                                            case 6003: {
                                                                return afoj.at;
                                                            }
                                                            case 6002: {
                                                                return afoj.as;
                                                            }
                                                            case 6001: {
                                                                return afoj.ar;
                                                            }
                                                            case 6000: {
                                                                return afoj.aq;
                                                            }
                                                        }
                                                        break;
                                                    }
                                                    case 5004: {
                                                        return afoj.ap;
                                                    }
                                                    case 5003: {
                                                        return afoj.ao;
                                                    }
                                                    case 5002: {
                                                        return afoj.an;
                                                    }
                                                    case 5001: {
                                                        return afoj.am;
                                                    }
                                                    case 5000: {
                                                        return afoj.al;
                                                    }
                                                }
                                                break;
                                            }
                                            case 4002: {
                                                return afoj.ak;
                                            }
                                            case 4001: {
                                                return afoj.aj;
                                            }
                                            case 4000: {
                                                return afoj.ai;
                                            }
                                        }
                                        break;
                                    }
                                    case 3002: {
                                        return afoj.ah;
                                    }
                                    case 3001: {
                                        return afoj.ag;
                                    }
                                    case 3000: {
                                        return afoj.af;
                                    }
                                }
                                break;
                            }
                            case 2017: {
                                return afoj.ae;
                            }
                            case 2016: {
                                return afoj.ad;
                            }
                            case 2015: {
                                return afoj.ac;
                            }
                            case 2014: {
                                return afoj.ab;
                            }
                            case 2013: {
                                return afoj.aa;
                            }
                            case 2012: {
                                return afoj.Z;
                            }
                            case 2011: {
                                return afoj.Y;
                            }
                            case 2010: {
                                return afoj.X;
                            }
                            case 2009: {
                                return afoj.W;
                            }
                            case 2008: {
                                return afoj.V;
                            }
                            case 2007: {
                                return afoj.U;
                            }
                            case 2006: {
                                return afoj.T;
                            }
                            case 2005: {
                                return afoj.S;
                            }
                            case 2004: {
                                return afoj.R;
                            }
                            case 2003: {
                                return afoj.Q;
                            }
                            case 2002: {
                                return afoj.P;
                            }
                            case 2001: {
                                return afoj.O;
                            }
                            case 2000: {
                                return afoj.N;
                            }
                        }
                        break;
                    }
                    case 1013: {
                        return afoj.M;
                    }
                    case 1012: {
                        return afoj.L;
                    }
                    case 1011: {
                        return afoj.K;
                    }
                    case 1010: {
                        return afoj.J;
                    }
                    case 1009: {
                        return afoj.I;
                    }
                    case 1008: {
                        return afoj.H;
                    }
                    case 1007: {
                        return afoj.G;
                    }
                    case 1006: {
                        return afoj.F;
                    }
                    case 1005: {
                        return afoj.E;
                    }
                    case 1004: {
                        return afoj.D;
                    }
                    case 1003: {
                        return afoj.C;
                    }
                    case 1002: {
                        return afoj.B;
                    }
                    case 1001: {
                        return afoj.A;
                    }
                    case 1000: {
                        return afoj.z;
                    }
                }
                break;
            }
            case 24: {
                return afoj.y;
            }
            case 23: {
                return afoj.x;
            }
            case 22: {
                return afoj.w;
            }
            case 21: {
                return afoj.v;
            }
            case 20: {
                return afoj.s;
            }
            case 19: {
                return afoj.r;
            }
            case 18: {
                return afoj.q;
            }
            case 17: {
                return afoj.p;
            }
            case 16: {
                return afoj.o;
            }
            case 15: {
                return afoj.n;
            }
            case 14: {
                return afoj.k;
            }
            case 13: {
                return afoj.j;
            }
            case 12: {
                return afoj.i;
            }
            case 11: {
                return afoj.h;
            }
            case 10: {
                return afoj.u;
            }
            case 9: {
                return afoj.t;
            }
            case 8: {
                return afoj.m;
            }
            case 7: {
                return afoj.l;
            }
            case 6: {
                return afoj.g;
            }
            case 5: {
                return afoj.f;
            }
            case 4: {
                return afoj.e;
            }
            case 3: {
                return afoj.d;
            }
            case 2: {
                return afoj.c;
            }
            case 1: {
                return afoj.b;
            }
            case 0: {
                return afoj.a;
            }
        }
    }
    
    public final int getNumber() {
        return this.eD;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.eD);
    }
}
