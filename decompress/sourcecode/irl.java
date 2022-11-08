import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.ViewGroup$LayoutParams;
import java.util.Iterator;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import android.os.Looper;
import android.content.Context;
import android.os.Handler;
import java.util.Set;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class irl extends aazp
{
    public View a;
    View b;
    public String c;
    public final xlv d;
    public final Set e;
    public final Set f;
    private boolean g;
    private boolean h;
    private final Handler i;
    
    public irl(final Context context, final xlv d) {
        super(context);
        this.i = new Handler(Looper.getMainLooper());
        this.d = d;
        this.e = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
        this.f = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
    }
    
    private final void m() {
        final Iterator iterator = this.e.iterator();
        while (iterator.hasNext()) {
            ((aamq)iterator.next()).pd(this.g);
        }
    }
    
    public final ViewGroup$LayoutParams a() {
        return new ViewGroup$LayoutParams(-1, -1);
    }
    
    public final View c(final Context context) {
        final View inflate = LayoutInflater.from(context).inflate(2131624790, (ViewGroup)null);
        (this.a = inflate.findViewById(2131427996)).setOnClickListener((View$OnClickListener)new ina(this, 10));
        (this.b = inflate.findViewById(2131430413)).setOnClickListener((View$OnClickListener)new ina(this, 11));
        return inflate;
    }
    
    public final void e(final Context context, final View view) {
    }
    
    public final void h(final boolean h) {
        if (this.h == h) {
            return;
        }
        this.h = h;
        final Iterator iterator = this.f.iterator();
        while (iterator.hasNext()) {
            ((aamp)iterator.next()).H(h);
        }
    }
    
    public final void mk() {
        super.mk();
        if (!this.g) {
            return;
        }
        this.g = false;
        this.m();
    }
    
    public final void mm() {
        super.mm();
        if (this.g) {
            return;
        }
        this.g = true;
        this.m();
        this.i.postDelayed((Runnable)new ihc(this, 9), 300L);
    }
    
    public final boolean oU() {
        return true;
    }
}
