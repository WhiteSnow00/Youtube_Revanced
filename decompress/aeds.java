import android.os.IInterface;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeds implements aeeu
{
    public static final aeds a;
    public static final aeds b;
    public static final aeds c;
    public static final aeds d;
    public static final aeds e;
    private final int f;
    
    static {
        e = new aeds(4);
        d = new aeds(3);
        c = new aeds(2);
        b = new aeds(1);
        a = new aeds(0);
    }
    
    private aeds(final int f) {
        this.f = f;
    }
    
    @Override
    public final Object a(final IBinder binder) {
        final int f = this.f;
        final Object o = null;
        final Object o2 = null;
        final Object o3 = null;
        final Object o4 = null;
        final Object o5 = null;
        if (f == 0) {
            Object o6;
            if (binder == null) {
                o6 = o4;
            }
            else {
                final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.play.core.lmd.protocol.ILmdOverlayService");
                if (queryLocalInterface instanceof aeed) {
                    o6 = queryLocalInterface;
                }
                else {
                    o6 = new aeed(binder);
                }
            }
            return o6;
        }
        if (f == 1) {
            Object o7;
            if (binder == null) {
                o7 = o3;
            }
            else {
                final IInterface queryLocalInterface2 = binder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
                if (queryLocalInterface2 instanceof aede) {
                    o7 = queryLocalInterface2;
                }
                else {
                    o7 = new aede(binder);
                }
            }
            return o7;
        }
        if (f == 2) {
            Object o8;
            if (binder == null) {
                o8 = o2;
            }
            else {
                final IInterface queryLocalInterface3 = binder.queryLocalInterface("com.google.android.play.core.prewarm.protocol.IPrewarmService");
                if (queryLocalInterface3 instanceof aeeh) {
                    o8 = queryLocalInterface3;
                }
                else {
                    o8 = new aeeh(binder);
                }
            }
            return o8;
        }
        if (f != 3) {
            Object o9;
            if (binder == null) {
                o9 = o5;
            }
            else {
                final IInterface queryLocalInterface4 = binder.queryLocalInterface("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
                if (queryLocalInterface4 instanceof aefv) {
                    o9 = queryLocalInterface4;
                }
                else {
                    o9 = new aefv(binder);
                }
            }
            return o9;
        }
        Object o10;
        if (binder == null) {
            o10 = o;
        }
        else {
            final IInterface queryLocalInterface5 = binder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
            if (queryLocalInterface5 instanceof aedi) {
                o10 = queryLocalInterface5;
            }
            else {
                o10 = new aedi(binder);
            }
        }
        return o10;
    }
}
