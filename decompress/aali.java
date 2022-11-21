import java.util.concurrent.Executor;
import com.google.android.libraries.youtube.player.features.prefetch.WillAutonavInformer;
import com.google.android.libraries.youtube.player.features.markers.sync.TimedSyncObserverImpl;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aali implements arom
{
    private final int a;
    
    public aali(final int a) {
        this.a = a;
    }
    
    public static teq b() {
        return aamn.b();
    }
    
    public static aaqz c() {
        return new aaqz();
    }
    
    public static aard d(final Object o) {
        return new aard((adgg)o, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static Boolean e(final Context context) {
        context.getClass();
        if (tqf.c == null) {
            tqf.c = context.getPackageManager().hasSystemFeature("android.hardware.sensor.gyroscope");
        }
        return tqf.c;
    }
    
    public static aazb f() {
        return new aazb();
    }
    
    public static abbe g(final abbx abbx) {
        return new abbe(abbx, 0);
    }
    
    public static abbu h() {
        return new abbu();
    }
    
    public static abbx i(final veh veh, final abbu abbu) {
        return new abbx(veh, abbu);
    }
    
    public static abbg j(final Context context, final abbx abbx) {
        return new abbg(context, abbx, 1, (byte[])null);
    }
    
    public static abbo k(abbg abbg, final abbg abbg2, final vbs vbs) {
        if (vbs.cN()) {
            abbg = abbg2;
        }
        abbg.getClass();
        return (abbo)abbg;
    }
    
    public static vlh l(final dba dba, final abwe abwe) {
        return (vlh)new vah(dba, abwe, 0, (byte[])null);
    }
    
    public static TimedSyncObserverImpl m(final abqz abqz, final aapu aapu) {
        return new TimedSyncObserverImpl(abqz, aapu, (byte[])null, (byte[])null);
    }
    
    public static WillAutonavInformer n(final tnz tnz, final thg thg, final mbb mbb, final zoa zoa, final abqz abqz) {
        return new WillAutonavInformer(tnz, thg, mbb, zoa, abqz, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static adgg o(final atnb atnb) {
        return new adgg(atnb, (byte[])null, (byte[])null);
    }
    
    public static abqq p(final adgg adgg) {
        final abqq m = ((abqz)adgg.a).m();
        m.getClass();
        return m;
    }
    
    public static abzz q(final adgg adgg) {
        final abzz u = ((abqz)adgg.a).u();
        u.getClass();
        return u;
    }
    
    public static aayh r(final adgg adgg, final atnb atnb, final aazb aazb, final vbs vbs, final vbs vbs2, final atnb atnb2, final aayt aayt, final aapu aapu) {
        return new aayh(adgg, atnb, aazb, vbs, vbs2, atnb2, aayt, aapu, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static adnd s(final zek zek, final adgg adgg) {
        zek.b = ((abqz)adgg.a).cm();
        final adnd cj = ((abqz)adgg.a).cj();
        cj.getClass();
        return cj;
    }
    
    public static aazo t(final aefs aefs, final vku vku, final Executor executor, final vmx vmx, final abrp abrp) {
        return new aazo(aefs, vku, executor, vmx, abrp, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    @Override
    public final Object a() {
        switch (this.a) {
            default: {
                throw null;
            }
            case 19: {
                throw null;
            }
            case 18: {
                throw null;
            }
            case 17: {
                throw null;
            }
            case 16: {
                throw null;
            }
            case 15: {
                throw null;
            }
            case 14: {
                throw null;
            }
            case 13: {
                throw null;
            }
            case 12: {
                throw null;
            }
            case 11: {
                throw null;
            }
            case 10: {
                throw null;
            }
            case 9: {
                throw null;
            }
            case 8: {
                throw null;
            }
            case 7: {
                throw null;
            }
            case 6: {
                throw null;
            }
            case 5: {
                return aamn.a();
            }
            case 4: {
                return aamn.b();
            }
            case 3: {
                throw null;
            }
            case 2: {
                throw null;
            }
            case 1: {
                return aalf.a;
            }
            case 0: {
                throw null;
            }
        }
    }
}
