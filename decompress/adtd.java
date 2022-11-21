import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adtd
{
    public static final afma a;
    public final adsz b;
    public final odx c;
    public final String d;
    public final adso e;
    public final afui f;
    
    static {
        a = afma.m("com/google/android/livesharing/internal/LiveSharingSessionFactory");
    }
    
    public adtd(final odx c, final String d, final adso e, final afui f, final adsz b) {
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.b = b;
    }
    
    public static void a(final aheu aheu, Object o) {
        try {
            final agvz agvz = (agvz)o;
            final adsc a = adsd.a();
            a.b(agvz.b);
            ahcf ahcf;
            if ((ahcf = agvz.c) == null) {
                ahcf = ahcf.a;
            }
            a.c(adzw.av(ahcf));
            final int c = agsk.c(agvz.e);
            final int n = 1;
            int n2;
            if ((n2 = c) == 0) {
                n2 = 1;
            }
            final int n3 = n2 - 2;
            int a2 = n;
            if (n3 != 1) {
                a2 = 2;
                if (n3 != 2) {
                    a2 = 3;
                    if (n3 != 3) {
                        a2 = 4;
                        if (n3 != 4) {
                            throw new AssertionError();
                        }
                    }
                }
            }
            a.a = a2;
            double f;
            if ((f = agvz.f) == 0.0) {
                f = 1.0;
            }
            a.d(f);
            o = new adra(aheu, a.a(), 3, null, null, null, null);
            adst.a(afxr.o((Runnable)o, (Executor)aheu.b), "Failed to apply state.", new Object[0]);
        }
        catch (final RuntimeException ex) {
            c.i(((aflw)adtd.a).g(), "Unexpected error while applying an update.", "com/google/android/livesharing/internal/LiveSharingSessionFactory", "lambda$createAndActivateCoActivity$5", '¶', "LiveSharingSessionFactory.java", ex);
        }
        catch (final AssertionError assertionError) {
            c.i(((aflw)adtd.a).g(), "Invalid update proto.", "com/google/android/livesharing/internal/LiveSharingSessionFactory", "lambda$createAndActivateCoActivity$5", '´', "LiveSharingSessionFactory.java", assertionError);
        }
    }
}
