// 
// Decompiled by Procyon v0.6.0
// 

public enum apke implements ahdd
{
    a("UPLOAD_FLOW_SOURCE_UNKNOWN", 0, 0), 
    b("UPLOAD_FLOW_SOURCE_YOUTUBE_APP_GALLERY", 1, 1), 
    c("UPLOAD_FLOW_SOURCE_YOUTUBE_APP_IN_APP_CAMERA", 2, 2), 
    d("UPLOAD_FLOW_SOURCE_YOUTUBE_APP_SYSTEM_CAMERA", 3, 3), 
    e("UPLOAD_FLOW_SOURCE_YOUTUBE_APP_INTERNAL", 4, 4), 
    f("UPLOAD_FLOW_SOURCE_EXTERNAL", 5, 5), 
    g("UPLOAD_FLOW_SOURCE_YOUTUBE_APP_GALLERY_REMOTE", 6, 6), 
    h("UPLOAD_FLOW_SOURCE_YOUTUBE_APP_SHORTS_GALLERY", 7, 7), 
    i("UPLOAD_FLOW_SOURCE_YOUTUBE_APP_SHORTS_CAMERA", 8, 8), 
    j("UPLOAD_FLOW_SOURCE_EXTERNAL_YTGO", 9, 64);
    
    private static final apke[] l;
    public final int k;
    
    private apke(final String s, final int n, final int k) {
        this.k = k;
    }
    
    public static ahdf a() {
        return apkc.d;
    }
    
    public static apke b(final int n) {
        if (n == 64) {
            return apke.j;
        }
        switch (n) {
            default: {
                return null;
            }
            case 8: {
                return apke.i;
            }
            case 7: {
                return apke.h;
            }
            case 6: {
                return apke.g;
            }
            case 5: {
                return apke.f;
            }
            case 4: {
                return apke.e;
            }
            case 3: {
                return apke.d;
            }
            case 2: {
                return apke.c;
            }
            case 1: {
                return apke.b;
            }
            case 0: {
                return apke.a;
            }
        }
    }
    
    public final int getNumber() {
        return this.k;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.k);
    }
}
