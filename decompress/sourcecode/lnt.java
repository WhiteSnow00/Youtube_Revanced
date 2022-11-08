import com.google.android.apps.youtube.embeddedplayer.service.userinfo.service.g;
import android.net.Uri;
import com.google.android.apps.youtube.embeddedplayer.service.errorlogging.service.b;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.e;
import com.google.android.apps.youtube.embeddedplayer.service.userinfo.service.a;
import com.google.android.apps.youtube.embeddedplayer.service.userinfo.service.j;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.d;
import android.content.SharedPreferences;
import java.util.Random;
import com.google.protobuf.MessageLite;
import android.content.Context;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lnt implements arjd
{
    private final atjj a;
    private final atjj b;
    private final /* synthetic */ int c;
    private final Object d;
    
    public lnt(final atjj a, final atjj d, final atjj b, final int c) {
        this.c = c;
        this.a = a;
        this.d = d;
        this.b = b;
    }
    
    public lnt(final atjj b, final atjj a, final atjj d, final int c, final byte[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
        this.d = d;
    }
    
    public lnt(final atjj a, final atjj b, final atjj d, final int c, final char[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
        this.d = d;
    }
    
    public lnt(final atjj d, final atjj a, final atjj b, final int c, final float[] array) {
        this.c = c;
        this.d = d;
        this.a = a;
        this.b = b;
    }
    
    public lnt(final atjj d, final atjj b, final atjj a, final int c, final int[] array) {
        this.c = c;
        this.d = d;
        this.b = b;
        this.a = a;
    }
    
    public lnt(final atjj a, final atjj b, final atjj d, final int c, final short[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
        this.d = d;
    }
    
    public lnt(final atjj b, final atjj a, final atjj d, final int c, final boolean[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
        this.d = d;
    }
    
    public lnt(final atjj d, final atjj a, final atjj b, final int c, final byte[][] array) {
        this.c = c;
        this.d = d;
        this.a = a;
        this.b = b;
    }
    
    public lnt(final atjj d, final atjj a, final atjj b, final int c, final char[][] array) {
        this.c = c;
        this.d = d;
        this.a = a;
        this.b = b;
    }
    
    public lnt(final atjj d, final atjj a, final atjj b, final int c, final float[][] array) {
        this.c = c;
        this.d = d;
        this.a = a;
        this.b = b;
    }
    
    public lnt(final atjj a, final atjj b, final atjj d, final int c, final int[][] array) {
        this.c = c;
        this.a = a;
        this.b = b;
        this.d = d;
    }
    
    public lnt(final atjj d, final atjj a, final atjj b, final int c, final short[][] array) {
        this.c = c;
        this.d = d;
        this.a = a;
        this.b = b;
    }
    
    public lnt(final atjj a, final atjj b, final atjj d, final int c, final boolean[][] array) {
        this.c = c;
        this.a = a;
        this.b = b;
        this.d = d;
    }
    
    public lnt(final atjj d, final atjj a, final atjj b, final int c, final byte[][][] array) {
        this.c = c;
        this.d = d;
        this.a = a;
        this.b = b;
    }
    
    public lnt(final phy d, final atjj b, final atjj a, final int c) {
        this.c = c;
        this.d = d;
        this.b = b;
        this.a = a;
    }
    
    public static lnt b(final atjj atjj, final atjj atjj2, final atjj atjj3) {
        return new lnt(atjj, atjj2, atjj3, 1, (byte[])null);
    }
    
    public static lnt c(final atjj atjj, final atjj atjj2, final atjj atjj3) {
        return new lnt(atjj, atjj2, atjj3, 3, (short[])null);
    }
    
    public static lnt d(final atjj atjj, final atjj atjj2, final atjj atjj3) {
        return new lnt(atjj, atjj2, atjj3, 4);
    }
    
    public static lnt e(final atjj atjj, final atjj atjj2, final atjj atjj3) {
        return new lnt(atjj, atjj2, atjj3, 6, (boolean[])null);
    }
    
    public static lnt f(final atjj atjj, final atjj atjj2, final atjj atjj3) {
        return new lnt(atjj, atjj2, atjj3, 9);
    }
    
    public static lnt g(final atjj atjj, final atjj atjj2, final atjj atjj3) {
        return new lnt(atjj, atjj2, atjj3, 10);
    }
    
    public static lnt h(final atjj atjj, final atjj atjj2, final atjj atjj3) {
        return new lnt(atjj, atjj2, atjj3, 11);
    }
    
    public static lnt i(final atjj atjj, final atjj atjj2, final atjj atjj3) {
        return new lnt(atjj, atjj2, atjj3, 14, (char[][])null);
    }
    
    public static lnt j(final atjj atjj, final atjj atjj2, final atjj atjj3) {
        return new lnt(atjj, atjj2, atjj3, 16, (int[][])null);
    }
    
    public static lnt k(final atjj atjj, final atjj atjj2, final atjj atjj3) {
        return new lnt(atjj, atjj2, atjj3, 17, (boolean[][])null);
    }
    
    public static lnt l(final atjj atjj, final atjj atjj2, final atjj atjj3) {
        return new lnt(atjj, atjj2, atjj3, 18);
    }
    
    public static lnt m(final atjj atjj, final atjj atjj2, final atjj atjj3) {
        return new lnt(atjj, atjj2, atjj3, 19, (float[][])null);
    }
    
    public static lnt n(final atjj atjj, final atjj atjj2, final atjj atjj3) {
        return new lnt(atjj, atjj2, atjj3, 20, (byte[][][])null);
    }
    
    public static rrd o(final atjj atjj, final atjj atjj2, final rxr rxr) {
        return new rrd(atjj, atjj2, rxr, 0, (byte[])null);
    }
    
    public static rrd p(final atjj atjj, final atjj atjj2, final rxr rxr) {
        return new rrd(atjj, atjj2, rxr, 2, (byte[])null);
    }
    
    public static afts q(afts afts, final aexq aexq, final lzi lzi) {
        if (aexq.e((Object)false)) {
            afts = lzi.i(oaw.g(afts));
        }
        else {
            afts = lzi.i(ocw.a(afts));
        }
        afts.getClass();
        return afts;
    }
    
    public static afts r(afts afts, final aexq aexq, final lzi lzi) {
        if (aexq.e((Object)false)) {
            afts = lzi.i(oaw.g(afts));
        }
        else {
            afts = lzi.i(ocw.a(afts));
        }
        afts.getClass();
        return afts;
    }
    
    public static afts s(afts afts, final aexq aexq, final lzi lzi) {
        if (aexq.e((Object)false)) {
            afts = lzi.i(oaw.g(afts));
        }
        else {
            afts = lzi.i(ocw.a(afts));
        }
        afts.getClass();
        return afts;
    }
    
    public static tzs t(final asgt asgt, final rwr rwr, final qcv qcv) {
        return new tzs(asgt, rwr, qcv, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    public static rpn u(final zki zki, final Executor executor, final qcv qcv) {
        return new rpn(zki, executor);
    }
    
    public static rov v(final atjj atjj, final qcv qcv, final zhb zhb) {
        return new rov(atjj, zhb, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
}
