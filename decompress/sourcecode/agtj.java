// 
// Decompiled by Procyon v0.6.0
// 

public enum agtj implements agzm
{
    a("UNKNOWN", 0, 0), 
    b("DELIVERED_FCM_PUSH", 1, 1), 
    c("SCHEDULED_RECEIVER", 2, 2), 
    d("FETCHED_LATEST_THREADS", 3, 3), 
    e("FETCHED_UPDATED_THREADS", 4, 4), 
    f("LOCAL_NOTIFICATION_CREATED", 5, 5), 
    g("LOCAL_NOTIFICATION_UPDATED", 6, 6);
    
    public final int h;
    
    private agtj(final String s, final int n, final int h) {
        this.h = h;
    }
    
    public static agtj a(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 6: {
                return agtj.g;
            }
            case 5: {
                return agtj.f;
            }
            case 4: {
                return agtj.e;
            }
            case 3: {
                return agtj.d;
            }
            case 2: {
                return agtj.c;
            }
            case 1: {
                return agtj.b;
            }
            case 0: {
                return agtj.a;
            }
        }
    }
    
    public static agzo b() {
        return agte.c;
    }
    
    public final int getNumber() {
        return this.h;
    }
    
    @Override
    public final String toString() {
        return Integer.toString(this.h);
    }
}
