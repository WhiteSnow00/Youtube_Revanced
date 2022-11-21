// 
// Decompiled by Procyon v0.6.0
// 

public enum apkf implements ahdd
{
    A("UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_TRANSFER_COMPLETED", 26, 22), 
    B("UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_TRANSFER_FAILED", 27, 23), 
    C("UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_UPLOAD_COMPLETED", 28, 24), 
    D("UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_UPLOAD_ABANDONED", 29, 25), 
    E("UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_UPLOAD_FAILED", 30, 26), 
    F("UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_UPLOAD_REJECTED", 31, 37), 
    G("UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_UPLOAD_INTENT_RECEIVED", 32, 27), 
    H("UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_UPLOAD_CONFIRMED", 33, 71), 
    I("UPLOAD_FRONTEND_EVENT_TYPE_ESCAPE_HATCH_USED", 34, 28), 
    J("UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_COPIED_FILE_CHUNK", 35, 29), 
    @Deprecated
    K("UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_FAILED_COPY_FILE", 36, 30), 
    L("UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_SKIPPED_TRANSCODE", 37, 31), 
    M("UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_TRANSCODE_COMPLETED", 38, 76), 
    N("UPLOAD_FRONTEND_EVENT_TYPE_FILE_COPY_READ_ATTEMPTED", 39, 32), 
    O("UPLOAD_FRONTEND_EVENT_TYPE_UPLOAD_RESUMED_FROM_COPY", 40, 33), 
    P("UPLOAD_FRONTEND_EVENT_TYPE_BLACK_BOX_RECOVERED", 41, 38), 
    Q("UPLOAD_FRONTEND_EVENT_TYPE_PROCESSOR_STATE_CHANGED", 42, 39), 
    R("UPLOAD_FRONTEND_EVENT_TYPE_UPLOAD_FLOW_STARTED", 43, 40), 
    S("UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_CANNOT_CREATE_TASK", 44, 41), 
    T("UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_TRANSFER_PROGRESS_REGRESSED", 45, 42), 
    U("UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_UPLOAD_CREATION_STARTED", 46, 43), 
    V("UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_UPLOAD_RESUME_FROM_DRAFT", 47, 112), 
    W("UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_UPLOAD_CREATION_WARNING", 48, 72), 
    X("UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_STALE_FEEDBACK_DATA", 49, 44), 
    Y("UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_TRANSFER_PROGRESSBAR_STUCK", 50, 45), 
    Z("UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_PROCESSING_PROGRESSBAR_STUCK", 51, 46), 
    a("UPLOAD_FRONTEND_EVENT_TYPE_UNKNOWN", 0, 0), 
    aA("UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_ENTERED_SHORTS_SEGMENT_IMPORT_GALLERY", 78, 118), 
    aB("UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_ENTERED_SHORTS_VIDEO_INGESTION", 79, 128), 
    aC("UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_SELECTED_GALLERY_VIDEO", 80, 70), 
    aD("UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_SELECTED_SHORTS_SEGMENT_IMPORT_GALLERY_VIDEO", 81, 119), 
    aE("UPLOAD_FRONTEND_EVENT_TYPE_RESUMING_UPLOAD_AFTER_CRASH", 82, 75), 
    aF("UPLOAD_FRONTEND_EVENT_TYPE_RESUMING_UPLOAD", 83, 91), 
    aG("UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_MOVED_APP_TO_BACKGROUND", 84, 77), 
    aH("UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_MOVED_APP_TO_FOREGROUND", 85, 78), 
    aI("UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_ACQUIRED_MEDIA_FOR_UPLOAD", 86, 79), 
    aJ("UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_READY_TO_UPLOAD", 87, 80), 
    aK("UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_FINALIZE_UPLOAD", 88, 81), 
    aL("UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_METADATA_TRACK_FOUND", 89, 84), 
    aM("UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_MP4PARSER_GEN_TRACK_FAILED", 90, 85), 
    aN("UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_MP4PARSER_GEN_TRACK_FAILED_SKIP_EDIT", 91, 86), 
    aO("UPLOAD_FRONTEND_EVENT_TYPE_SEGMENT_IMPORT_TRANSCODING_COMPLETED", 92, 87), 
    aP("UPLOAD_FRONTEND_EVENT_TYPE_SEGMENT_IMPORT_TRANSCODING_FAILED", 93, 88), 
    aQ("UPLOAD_FRONTEND_EVENT_TYPE_SEGMENT_IMPORT_TRANSCODING_CANCELLED", 94, 89), 
    aR("UPLOAD_FRONTEND_EVENT_TYPE_SEGMENT_IMPORT_TRANSCODING_TIMED_OUT", 95, 90), 
    aS("UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_SIDE_RENDERING_COMPLETED", 96, 92), 
    aT("UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_SIDE_RENDERING_FAILED", 97, 93), 
    aU("UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_SIDE_RENDERING_CANCELLED", 98, 94), 
    aV("UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_SIDE_RENDERING_TIMED_OUT", 99, 95), 
    aW("UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_SIDE_RENDERING_REQUESTED", 100, 96), 
    aX("UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_SIDE_RENDERING_BACKGROUNDED", 101, 100), 
    aY("UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_CUSTOM_THUMBNAIL_UPLOAD_REQUESTED", 102, 97), 
    aZ("UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_CUSTOM_THUMBNAIL_UPLOAD_FAILED", 103, 98), 
    aa("UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_PROCESSING_PROGRESS_UPDATE", 52, 61), 
    ab("UPLOAD_FRONTEND_EVENT_TYPE_PRECHECKS_REQUESTED", 53, 47), 
    @Deprecated
    ac("UPLOAD_FRONTEND_EVENT_TYPE_PRECHECKS_COPYRIGHT_STARTED", 54, 48), 
    @Deprecated
    ad("UPLOAD_FRONTEND_EVENT_TYPE_PRECHECKS_COPYRIGHT_COMPLETED", 55, 49), 
    @Deprecated
    ae("UPLOAD_FRONTEND_EVENT_TYPE_PRECHECKS_COPYRIGHT_FAILED_TO_START", 56, 50), 
    @Deprecated
    af("UPLOAD_FRONTEND_EVENT_TYPE_PRECHECKS_COPYRIGHT_ETA_REACHED", 57, 51), 
    ag("UPLOAD_FRONTEND_EVENT_TYPE_PRECHECKS_COPYRIGHT_FALSE_NEGATIVE", 58, 52), 
    ah("UPLOAD_FRONTEND_EVENT_TYPE_PRECHECKS_COPYRIGHT_FALSE_POSITIVE", 59, 53), 
    ai("UPLOAD_FRONTEND_EVENT_TYPE_PRECHECKS_INLINE_EDIT_IN_UPLOADS_DIALOG", 60, 54), 
    aj("UPLOAD_FRONTEND_EVENT_TYPE_PRECHECKS_INLINE_EDIT_FIXED_ISSUE", 61, 55), 
    ak("UPLOAD_FRONTEND_EVENT_TYPE_PRECHECK_FAILED_TO_START", 62, 73), 
    al("UPLOAD_FRONTEND_EVENT_TYPE_PRECHECK_ETA_REACHED", 63, 74), 
    am("UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_METADATA_TAPPED_BACK", 64, 56), 
    an("UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_EDITOR_TAPPED_BACK", 65, 57), 
    ao("UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_CANNOT_FETCH_REMOTE_VIDEO", 66, 58), 
    ap("UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_CANCEL_EDITOR_FETCH", 67, 59), 
    aq("UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_CANCEL_RETRY_DIALOG", 68, 60), 
    ar("UPLOAD_FRONTEND_EVENT_TYPE_ZERO_STEP_CHANNEL_CREATION_INITIATED", 69, 62), 
    as("UPLOAD_FRONTEND_EVENT_TYPE_ZERO_STEP_CHANNEL_CREATION_COMPLETED", 70, 63), 
    at("UPLOAD_FRONTEND_EVENT_TYPE_ZERO_STEP_CHANNEL_CREATION_FAILED", 71, 64), 
    au("UPLOAD_FRONTEND_EVENT_TYPE_PRE_MDE_CHANNEL_CREATION_INITIATED", 72, 65), 
    av("UPLOAD_FRONTEND_EVENT_TYPE_PRE_MDE_CHANNEL_CREATION_COMPLETED", 73, 66), 
    aw("UPLOAD_FRONTEND_EVENT_TYPE_PRE_MDE_CHANNEL_CREATION_FAILED", 74, 67), 
    ax("UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_ENTERED_SHORTS_CAMERA", 75, 68), 
    ay("UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_ENTERED_SHORTS_EDIT", 76, 69), 
    az("UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_ENTERED_SHORTS_GALLERY", 77, 82), 
    b("UPLOAD_FRONTEND_EVENT_TYPE_UPLOAD_INTENT", 1, 1);
    
    private static final apkf[] bA;
    
    ba("UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_CUSTOM_THUMBNAIL_SAVING_FAILED", 104, 99), 
    bb("UPLOAD_FRONTEND_EVENT_TYPE_SHORTS_THUMBNAIL_EDITOR_FRAME_EXTRACTION_FAILED", 105, 120), 
    bc("UPLOAD_FRONTEND_EVENT_TYPE_SHORTS_THUMBNAIL_EDITOR_FRAME_EXTRACTION_SUCCEEDED", 106, 121), 
    bd("UPLOAD_FRONTEND_EVENT_TYPE_SHORTS_THUMBNAIL_EDITOR_CLIENT_SIDE_RENDERING_FAILED", 107, 122), 
    be("UPLOAD_FRONTEND_EVENT_TYPE_SHORTS_THUMBNAIL_EDITOR_CLIENT_SIDE_RENDERING_SUCCEEDED", 108, 123), 
    bf("UPLOAD_FRONTEND_EVENT_TYPE_SHORTS_THUMBNAIL_EDITOR_FILMSTRIP_GENERATION_FAILED", 109, 124), 
    bg("UPLOAD_FRONTEND_EVENT_TYPE_SHORTS_THUMBNAIL_EDITOR_FILMSTRIP_GENERATION_SUCCEEDED", 110, 125), 
    bh("UPLOAD_FRONTEND_EVENT_TYPE_SHORTS_THUMBNAIL_EDITOR_PASS_THUMBNAIL_TO_CALLER_FAILED", 111, 126), 
    bi("UPLOAD_FRONTEND_EVENT_TYPE_SHORTS_THUMBNAIL_EDITOR_PASS_THUMBNAIL_TO_CALLER_SUCCEEDED", 112, 127), 
    bj("UPLOAD_FRONTEND_EVENT_TYPE_CLIP_TRIM_TRANSCODING_COMPLETED", 113, 101), 
    bk("UPLOAD_FRONTEND_EVENT_TYPE_CLIP_TRIM_TRANSCODING_FAILED", 114, 102), 
    bl("UPLOAD_FRONTEND_EVENT_TYPE_CLIP_TRIM_TRANSCODING_CANCELLED", 115, 103), 
    bm("UPLOAD_FRONTEND_EVENT_TYPE_CLIP_TRIM_TRANSCODING_TIMED_OUT", 116, 104), 
    bn("UPLOAD_FRONTEND_EVENT_TYPE_VIDEO_INGESTION_TRANSCODING_COMPLETED", 117, 105), 
    bo("UPLOAD_FRONTEND_EVENT_TYPE_VIDEO_INGESTION_TRANSCODING_FAILED", 118, 106), 
    bp("UPLOAD_FRONTEND_EVENT_TYPE_VIDEO_INGESTION_TRANSCODING_CANCELLED", 119, 107), 
    bq("UPLOAD_FRONTEND_EVENT_TYPE_VIDEO_INGESTION_TRANSCODING_TIMED_OUT", 120, 108), 
    br("UPLOAD_FRONTEND_EVENT_TYPE_EDIT_AUDIO_GEN_COMPLETED", 121, 109), 
    bs("UPLOAD_FRONTEND_EVENT_TYPE_EDIT_AUDIO_GEN_FAILED", 122, 110), 
    bt("UPLOAD_FRONTEND_EVENT_TYPE_EDIT_AUDIO_GEN_TIMED_OUT", 123, 111), 
    bu("UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_SHORTS_CREATION", 124, 113), 
    bv("UPLOAD_FRONTEND_EVENT_TYPE_TRIM_TO_EDITOR_TRANSCODING_COMPLETED", 125, 114), 
    bw("UPLOAD_FRONTEND_EVENT_TYPE_TRIM_TO_EDITOR_TRANSCODING_FAILED", 126, 115), 
    bx("UPLOAD_FRONTEND_EVENT_TYPE_TRIM_TO_EDITOR_TRANSCODING_CANCELLED", 127, 116), 
    by("UPLOAD_FRONTEND_EVENT_TYPE_TRIM_TO_EDITOR_TRANSCODING_TIMED_OUT", 128, 117), 
    c("UPLOAD_FRONTEND_EVENT_TYPE_UPLOAD_REJECTED", 2, 6), 
    d("UPLOAD_FRONTEND_EVENT_TYPE_UPLOAD_CANCEL", 3, 2), 
    e("UPLOAD_FRONTEND_EVENT_TYPE_CREATE_INTENT", 4, 3), 
    f("UPLOAD_FRONTEND_EVENT_TYPE_CREATE_CANCEL", 5, 4), 
    g("UPLOAD_FRONTEND_EVENT_TYPE_UPLOAD_RECOVERY", 6, 5), 
    h("UPLOAD_FRONTEND_EVENT_TYPE_UPLOAD_MESSAGE", 7, 7), 
    i("UPLOAD_FRONTEND_EVENT_TYPE_REGISTRATION_REQUEST_SENT", 8, 13), 
    j("UPLOAD_FRONTEND_EVENT_TYPE_REGISTRATION_RESPONSE_RECEIVED", 9, 83), 
    k("UPLOAD_FRONTEND_EVENT_TYPE_REGISTRATION_INFO_RECEIVED", 10, 8), 
    l("UPLOAD_FRONTEND_EVENT_TYPE_REGISTRATION_ERROR_RECEIVED", 11, 14), 
    m("UPLOAD_FRONTEND_EVENT_TYPE_RESUMING_VIDEO_FETCH_REQUEST_SENT", 12, 35), 
    n("UPLOAD_FRONTEND_EVENT_TYPE_UPLOAD_NOT_RESUMED", 13, 34), 
    o("UPLOAD_FRONTEND_EVENT_TYPE_RESUMED_UPLOAD_STARTED_TRANSFERRING", 14, 36), 
    p("UPLOAD_FRONTEND_EVENT_TYPE_FILE_SELECTED", 15, 9), 
    q("UPLOAD_FRONTEND_EVENT_TYPE_CAMERA_SELECTED", 16, 10), 
    r("UPLOAD_FRONTEND_EVENT_TYPE_CAMERA_START", 17, 11), 
    s("UPLOAD_FRONTEND_EVENT_TYPE_CAMERA_STOP", 18, 12), 
    t("UPLOAD_FRONTEND_EVENT_TYPE_SAVE_DRAFT_REQUEST_SENT", 19, 15), 
    u("UPLOAD_FRONTEND_EVENT_TYPE_SAVE_DRAFT_SUCCESS_RECEIVED", 20, 16), 
    v("UPLOAD_FRONTEND_EVENT_TYPE_SAVE_DRAFT_ERROR_RECEIVED", 21, 17), 
    w("UPLOAD_FRONTEND_EVENT_TYPE_FINISH_UPLOAD_REQUEST_SENT", 22, 18), 
    x("UPLOAD_FRONTEND_EVENT_TYPE_FINISH_UPLOAD_SUCCESS_RECEIVED", 23, 19), 
    y("UPLOAD_FRONTEND_EVENT_TYPE_FINISH_UPLOAD_ERROR_RECEIVED", 24, 20), 
    z("UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_TRANSFER_INITIATED", 25, 21);
    
    public final int bz;
    
    private apkf(final String s, final int n, final int bz) {
        this.bz = bz;
    }
    
    public static ahdf a() {
        return apkc.e;
    }
    
    public static apkf b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 128: {
                return apkf.aB;
            }
            case 127: {
                return apkf.bi;
            }
            case 126: {
                return apkf.bh;
            }
            case 125: {
                return apkf.bg;
            }
            case 124: {
                return apkf.bf;
            }
            case 123: {
                return apkf.be;
            }
            case 122: {
                return apkf.bd;
            }
            case 121: {
                return apkf.bc;
            }
            case 120: {
                return apkf.bb;
            }
            case 119: {
                return apkf.aD;
            }
            case 118: {
                return apkf.aA;
            }
            case 117: {
                return apkf.by;
            }
            case 116: {
                return apkf.bx;
            }
            case 115: {
                return apkf.bw;
            }
            case 114: {
                return apkf.bv;
            }
            case 113: {
                return apkf.bu;
            }
            case 112: {
                return apkf.V;
            }
            case 111: {
                return apkf.bt;
            }
            case 110: {
                return apkf.bs;
            }
            case 109: {
                return apkf.br;
            }
            case 108: {
                return apkf.bq;
            }
            case 107: {
                return apkf.bp;
            }
            case 106: {
                return apkf.bo;
            }
            case 105: {
                return apkf.bn;
            }
            case 104: {
                return apkf.bm;
            }
            case 103: {
                return apkf.bl;
            }
            case 102: {
                return apkf.bk;
            }
            case 101: {
                return apkf.bj;
            }
            case 100: {
                return apkf.aX;
            }
            case 99: {
                return apkf.ba;
            }
            case 98: {
                return apkf.aZ;
            }
            case 97: {
                return apkf.aY;
            }
            case 96: {
                return apkf.aW;
            }
            case 95: {
                return apkf.aV;
            }
            case 94: {
                return apkf.aU;
            }
            case 93: {
                return apkf.aT;
            }
            case 92: {
                return apkf.aS;
            }
            case 91: {
                return apkf.aF;
            }
            case 90: {
                return apkf.aR;
            }
            case 89: {
                return apkf.aQ;
            }
            case 88: {
                return apkf.aP;
            }
            case 87: {
                return apkf.aO;
            }
            case 86: {
                return apkf.aN;
            }
            case 85: {
                return apkf.aM;
            }
            case 84: {
                return apkf.aL;
            }
            case 83: {
                return apkf.j;
            }
            case 82: {
                return apkf.az;
            }
            case 81: {
                return apkf.aK;
            }
            case 80: {
                return apkf.aJ;
            }
            case 79: {
                return apkf.aI;
            }
            case 78: {
                return apkf.aH;
            }
            case 77: {
                return apkf.aG;
            }
            case 76: {
                return apkf.M;
            }
            case 75: {
                return apkf.aE;
            }
            case 74: {
                return apkf.al;
            }
            case 73: {
                return apkf.ak;
            }
            case 72: {
                return apkf.W;
            }
            case 71: {
                return apkf.H;
            }
            case 70: {
                return apkf.aC;
            }
            case 69: {
                return apkf.ay;
            }
            case 68: {
                return apkf.ax;
            }
            case 67: {
                return apkf.aw;
            }
            case 66: {
                return apkf.av;
            }
            case 65: {
                return apkf.au;
            }
            case 64: {
                return apkf.at;
            }
            case 63: {
                return apkf.as;
            }
            case 62: {
                return apkf.ar;
            }
            case 61: {
                return apkf.aa;
            }
            case 60: {
                return apkf.aq;
            }
            case 59: {
                return apkf.ap;
            }
            case 58: {
                return apkf.ao;
            }
            case 57: {
                return apkf.an;
            }
            case 56: {
                return apkf.am;
            }
            case 55: {
                return apkf.aj;
            }
            case 54: {
                return apkf.ai;
            }
            case 53: {
                return apkf.ah;
            }
            case 52: {
                return apkf.ag;
            }
            case 51: {
                return apkf.af;
            }
            case 50: {
                return apkf.ae;
            }
            case 49: {
                return apkf.ad;
            }
            case 48: {
                return apkf.ac;
            }
            case 47: {
                return apkf.ab;
            }
            case 46: {
                return apkf.Z;
            }
            case 45: {
                return apkf.Y;
            }
            case 44: {
                return apkf.X;
            }
            case 43: {
                return apkf.U;
            }
            case 42: {
                return apkf.T;
            }
            case 41: {
                return apkf.S;
            }
            case 40: {
                return apkf.R;
            }
            case 39: {
                return apkf.Q;
            }
            case 38: {
                return apkf.P;
            }
            case 37: {
                return apkf.F;
            }
            case 36: {
                return apkf.o;
            }
            case 35: {
                return apkf.m;
            }
            case 34: {
                return apkf.n;
            }
            case 33: {
                return apkf.O;
            }
            case 32: {
                return apkf.N;
            }
            case 31: {
                return apkf.L;
            }
            case 30: {
                return apkf.K;
            }
            case 29: {
                return apkf.J;
            }
            case 28: {
                return apkf.I;
            }
            case 27: {
                return apkf.G;
            }
            case 26: {
                return apkf.E;
            }
            case 25: {
                return apkf.D;
            }
            case 24: {
                return apkf.C;
            }
            case 23: {
                return apkf.B;
            }
            case 22: {
                return apkf.A;
            }
            case 21: {
                return apkf.z;
            }
            case 20: {
                return apkf.y;
            }
            case 19: {
                return apkf.x;
            }
            case 18: {
                return apkf.w;
            }
            case 17: {
                return apkf.v;
            }
            case 16: {
                return apkf.u;
            }
            case 15: {
                return apkf.t;
            }
            case 14: {
                return apkf.l;
            }
            case 13: {
                return apkf.i;
            }
            case 12: {
                return apkf.s;
            }
            case 11: {
                return apkf.r;
            }
            case 10: {
                return apkf.q;
            }
            case 9: {
                return apkf.p;
            }
            case 8: {
                return apkf.k;
            }
            case 7: {
                return apkf.h;
            }
            case 6: {
                return apkf.c;
            }
            case 5: {
                return apkf.g;
            }
            case 4: {
                return apkf.f;
            }
            case 3: {
                return apkf.e;
            }
            case 2: {
                return apkf.d;
            }
            case 1: {
                return apkf.b;
            }
            case 0: {
                return apkf.a;
            }
        }
    }
    
    public final int getNumber() {
        return this.bz;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.bz);
    }
}
