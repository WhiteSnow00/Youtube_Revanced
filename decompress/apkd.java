// 
// Decompiled by Procyon v0.6.0
// 

public enum apkd implements ahdd
{
    a("UPLOAD_FEATURE_UNKNOWN", 0, 0), 
    b("UPLOAD_FEATURE_STREAMING", 1, 2), 
    c("UPLOAD_FEATURE_PHOTO", 2, 3), 
    d("UPLOAD_FEATURE_LOCAL_TRANSCODE_REQUIRED", 3, 4), 
    e("UPLOAD_FEATURE_NO_STORAGE_PERMISSION", 4, 5), 
    f("UPLOAD_FEATURE_COPY_FILE", 5, 6), 
    g("UPLOAD_FEATURE_FETCH_REMOTE_FILE", 6, 7), 
    h("UPLOAD_FEATURE_REUSE_OPEN_SOURCE_VIDEO", 7, 8);
    
    private static final apkd[] j;
    public final int i;
    
    private apkd(final String s, final int n, final int i) {
        this.i = i;
    }
    
    public static ahdf a() {
        return apkc.a;
    }
    
    public static apkd b(final int n) {
        if (n == 0) {
            return apkd.a;
        }
        switch (n) {
            default: {
                return null;
            }
            case 8: {
                return apkd.h;
            }
            case 7: {
                return apkd.g;
            }
            case 6: {
                return apkd.f;
            }
            case 5: {
                return apkd.e;
            }
            case 4: {
                return apkd.d;
            }
            case 3: {
                return apkd.c;
            }
            case 2: {
                return apkd.b;
            }
        }
    }
    
    public final int getNumber() {
        return this.i;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.i);
    }
}
