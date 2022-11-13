import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import j$.util.Optional;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aazy implements abag, abao
{
    public final ativ a;
    public final abap b;
    public final Object c;
    private final ativ d;
    private final int e;
    private final Object f;
    
    public aazy(final Context context, final abap b, final int e) {
        this.e = e;
        this.b = b;
        this.d = ativ.aE();
        this.f = ativ.aE();
        this.a = ativ.aE();
        this.c = afev.n(abea.f, context.getResources().getString(2132019059), abea.g, context.getResources().getString(2132019061));
    }
    
    public aazy(final Context context, final abap b, final int e, final byte[] array) {
        this.e = e;
        this.b = b;
        this.d = ativ.aE();
        this.c = ativ.aE();
        this.a = ativ.aE();
        this.f = context.getResources().getString(2132019059);
    }
    
    private final void g(final abea abea) {
        final aazz o = this.b.o(abea);
        Optional optional = Optional.empty();
        if (o instanceof abaj) {
            optional = Optional.ofNullable((Object)((abaj)o).b);
        }
        this.a.tu((Object)optional);
        final TimelineMarker b = this.b.b(abea);
        final TimelineMarker[] n = this.b.n(abea);
        final Object o2 = null;
        CharSequence d;
        if (n != null && n.length > 0 && optional.isPresent()) {
            d = (String)((afev)this.c).get(abea);
        }
        else {
            d = null;
        }
        if (b != null) {
            d = b.d;
        }
        this.d.tu((Object)Optional.ofNullable((Object)d));
        final Object f = this.f;
        Object d2 = o2;
        if (b != null) {
            d2 = b.d;
        }
        ((ativ)f).tu((Object)Optional.ofNullable(d2));
    }
    
    private final void h(final TimelineMarker timelineMarker) {
        final TimelineMarker[] n = this.b.n(abea.f);
        final Object o = null;
        Object o2;
        if (n != null && n.length > 0) {
            o2 = this.f;
        }
        else {
            o2 = null;
        }
        if (timelineMarker != null) {
            o2 = timelineMarker.d;
        }
        this.d.tu((Object)Optional.ofNullable(o2));
        final Object c = this.c;
        Object d = o;
        if (timelineMarker != null) {
            d = timelineMarker.d;
        }
        ((ativ)c).tu((Object)Optional.ofNullable(d));
    }
    
    @Override
    public final ashi a() {
        if (this.e != 0) {
            return ((ashi)this.d).p().J();
        }
        return ((ashi)this.d).p().J();
    }
    
    @Override
    public final ashi b() {
        if (this.e != 0) {
            return ((ashi)this.a).p().J();
        }
        return ((ashi)this.a).p().J();
    }
    
    @Override
    public final void c(final TimelineMarker timelineMarker, final TimelineMarker timelineMarker2, final abea abea, final int n) {
        if (this.e != 0) {
            if (abea != abea.f) {
                return;
            }
            this.h(timelineMarker2);
        }
        else {
            if (!((afev)this.c).containsKey(abea)) {
                return;
            }
            this.g(abea);
        }
    }
    
    @Override
    public final void d(final abea abea) {
    }
    
    @Override
    public final ashi f() {
        if (this.e != 0) {
            return ((ashi)this.c).p().J();
        }
        return ((ashi)this.f).p().J();
    }
    
    public final asir[] lX(final abpu abpu) {
        if (this.e != 0) {
            this.h(this.b.b(abea.f));
            this.b.i(abea.f, this);
            return new asir[] { abpu.Q().an(new aauu(this, 19, null), (asjm)aaof.r), asfn.d((asjg)new toa(this, 15, (byte[])null)) };
        }
        final afke k = ((afev)this.c).s().k();
        while (k.hasNext()) {
            final abea abea = k.next();
            final aazz o = this.b.o(abea);
            if (o != null && !o.a.isEmpty()) {
                this.g(abea);
            }
            this.b.i(abea, this);
        }
        return new asir[] { asfn.d((asjg)new toa(this, 16)) };
    }
    
    @Override
    public final void oR(final abea abea, final boolean b) {
        if (this.e != 0) {
            if (abea != abea.f) {
                return;
            }
            this.h(this.b.b(abea.f));
        }
        else {
            if (!((afev)this.c).containsKey(abea)) {
                return;
            }
            this.g(abea);
        }
    }
}
