// 
// Decompiled by Procyon v0.6.0
// 

public enum apkg implements ahdd
{
    a("UPLOAD_PROCESSOR_ABANDONMENT_REASON_UNKNOWN", 0, 0), 
    b("UPLOAD_PROCESSOR_ABANDONMENT_REASON_DELETED_PENDING_UPLOAD", 1, 1), 
    c("UPLOAD_PROCESSOR_ABANDONMENT_REASON_METADATA_TAPPED_BACK", 2, 2), 
    d("UPLOAD_PROCESSOR_ABANDONMENT_REASON_EDITOR_TAPPED_BACK", 3, 3), 
    e("UPLOAD_PROCESSOR_ABANDONMENT_REASON_EDITOR_CANCEL_STREAMING_DUE_TO_EDITS", 4, 4), 
    f("UPLOAD_PROCESSOR_ABANDONMENT_REASON_CANNOT_FETCH_REMOTE_VIDEO", 5, 5), 
    g("UPLOAD_PROCESSOR_ABANDONMENT_REASON_EDITOR_FETCH_CANCEL", 6, 6), 
    h("UPLOAD_PROCESSOR_ABANDONMENT_REASON_TOO_MANY_UPLOADS_IN_SESSION", 7, 7), 
    i("UPLOAD_PROCESSOR_ABANDONMENT_REASON_CANCEL_RETRY_DIALOG", 8, 8), 
    j("UPLOAD_PROCESSOR_ABANDONMENT_REASON_NOT_OPENABLE_VIDEO", 9, 9), 
    k("UPLOAD_PROCESSOR_ABANDONMENT_REASON_INCOMPLETE_CREATION", 10, 10), 
    l("UPLOAD_PROCESSOR_ABANDONMENT_REASON_CANCELLED_CREATION", 11, 11), 
    m("UPLOAD_PROCESSOR_ABANDONMENT_REASON_TIMED_OUT_CREATION", 12, 12), 
    n("UPLOAD_PROCESSOR_ABANDONMENT_REASON_CREATION_CLOSED_DRAFT_SAVED", 13, 13), 
    o("UPLOAD_PROCESSOR_ABANDONMENT_REASON_CREATION_CLOSED_NOTHING_TO_SAVE", 14, 14), 
    p("UPLOAD_PROCESSOR_ABANDONMENT_REASON_MODE_SWITCHED", 15, 15), 
    q("UPLOAD_PROCESSOR_ABANDONMENT_REASON_CREATION_CLOSED_DRAFT_SAVED_FROM_MDE", 16, 16);
    
    private static final apkg[] s;
    public final int r;
    
    private apkg(final String s, final int n, final int r) {
        this.r = r;
    }
    
    public static ahdf a() {
        return apkc.f;
    }
    
    public static apkg b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 16: {
                return apkg.q;
            }
            case 15: {
                return apkg.p;
            }
            case 14: {
                return apkg.o;
            }
            case 13: {
                return apkg.n;
            }
            case 12: {
                return apkg.m;
            }
            case 11: {
                return apkg.l;
            }
            case 10: {
                return apkg.k;
            }
            case 9: {
                return apkg.j;
            }
            case 8: {
                return apkg.i;
            }
            case 7: {
                return apkg.h;
            }
            case 6: {
                return apkg.g;
            }
            case 5: {
                return apkg.f;
            }
            case 4: {
                return apkg.e;
            }
            case 3: {
                return apkg.d;
            }
            case 2: {
                return apkg.c;
            }
            case 1: {
                return apkg.b;
            }
            case 0: {
                return apkg.a;
            }
        }
    }
    
    public final int getNumber() {
        return this.r;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.r);
    }
}
