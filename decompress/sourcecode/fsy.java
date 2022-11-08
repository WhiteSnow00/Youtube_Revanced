import java.util.List;
import android.view.View;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import android.os.Looper;
import j$.time.Duration;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import android.text.TextUtils;
import com.google.android.apps.youtube.app.common.ui.elements.activestate.ActiveStateLifecycleController;
import android.content.Context;
import android.app.Activity;
import java.util.concurrent.Executor;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fsy implements ors
{
    public final Object a;
    public final Object b;
    private final /* synthetic */ int c;
    
    public fsy(final acuj a, final Handler b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public fsy(final addp a, final otd b, final int c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.c = c;
        a.getClass();
        this.a = a;
        this.b = b;
    }
    
    public fsy(final addr b, final Executor a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public fsy(final addt a, final zki b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public fsy(final Activity b, final adcs a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public fsy(final Activity b, final adcs a, final int c, final byte[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public fsy(final Context b, final osb a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public fsy(final arhr b, final asho a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public fsy(final arhr a, final thh b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public fsy(final lzi b, final lzi a, final int c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public fsy(final ohn b, final otd a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public fsy(final ohs a, final ActiveStateLifecycleController b, final gdh gdh, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
        final ActiveStateLifecycleController activeStateLifecycleController = b;
        b.c.add(gdh);
    }
    
    public fsy(final osb a, final oas b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public fsy(final wwu a, final Context b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public fsy(final xxn b, final uyi a, final int c, final byte[] array, final byte[] array2) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public fsy(final zki b, final addp a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public fsy(final zki b, final addt a, final int c, final byte[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public static long c() {
        final auev auev = new auev(aufc.k());
        int n2;
        final int n = n2 = 60 - ((auft)auev).n();
        if (n < 15) {
            n2 = n + 60;
        }
        return ((aufv)auev.b(n2)).a;
    }
    
    public static auev d(final long n) {
        return new auev(n);
    }
    
    public static final int e(final aiun aiun) {
        if (aiun.h) {
            return 65557;
        }
        if (aiun.g) {
            return 65556;
        }
        return 0;
    }
    
    public final agyr a() {
        switch (this.c) {
            default: {
                return apdv.b;
            }
            case 19: {
                return apdu.b;
            }
            case 18: {
                return amvp.b;
            }
            case 17: {
                return ajvy.b;
            }
            case 16: {
                return aiun.b;
            }
            case 15: {
                return ainh.b;
            }
            case 14: {
                return amiw.b;
            }
            case 13: {
                return aivj.b;
            }
            case 12: {
                return apdw.b;
            }
            case 11: {
                return aove.b;
            }
            case 10: {
                return aoeb.b;
            }
            case 9: {
                return aium.b;
            }
            case 8: {
                return aodw.b;
            }
            case 7: {
                return aqef.b;
            }
            case 6: {
                return aqda.b;
            }
            case 5: {
                return aqlq.b;
            }
            case 4: {
                return aqli.b;
            }
            case 3: {
                return aqij.b;
            }
            case 2: {
                return anme.b;
            }
            case 1: {
                return altj.b;
            }
            case 0: {
                return aqlf.b;
            }
        }
    }
}
