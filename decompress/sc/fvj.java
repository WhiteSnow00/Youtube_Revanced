import j$.util.function.Consumer$_CC;
import java.util.Set;
import android.view.View;
import java.util.Collection;
import java.util.ArrayList;
import j$.util.Optional;
import java.util.Map;
import com.google.android.libraries.quantum.fab.FloatingActionButton;
import android.widget.ImageView;
import android.os.Bundle;
import java.util.function.Consumer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fvj implements Consumer
{
    public final Object a;
    private final int b;
    
    public fvj(final ahaz a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fvj(final Bundle a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fvj(final ImageView a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fvj(final aome a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fvj(final aomx a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fvj(final aona a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fvj(final FloatingActionButton a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fvj(final fvl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fvj(final fvn a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fvj(final fwm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fvj(final fwp a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fvj(final fwy a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fvj(final fwz a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fvj(final Map a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public fvj(final wyw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void accept(final Object o) {
        switch (this.b) {
            default: {
                ((ImageView)this.a).setImageResource((int)o);
                return;
            }
            case 19: {
                final Object a = this.a;
                final tvp tvp = (tvp)o;
                final ImageView imageView = (ImageView)a;
                imageView.setImageTintList(tpe.ct(imageView.getContext(), tvp.a));
                return;
            }
            case 18: {
                ((fwy)this.a).h((String)o);
                return;
            }
            case 17: {
                final Object a2 = this.a;
                final fwy fwy = (fwy)o;
                final Optional ofNullable = Optional.ofNullable((Object)((fwz)a2).g);
                fwy.getClass();
                ofNullable.ifPresent((Consumer)new fvj(fwy, 18));
                return;
            }
            case 16: {
                ((fwp)this.a).f(((aomx)o).c);
                return;
            }
            case 15: {
                final Object a3 = this.a;
                final wyw wyw = (wyw)o;
                final aomx aomx = (aomx)a3;
                aomy aomy;
                if ((aomy = aomx.e) == null) {
                    aomy = aomy.a;
                }
                aicz a4;
                if (aomy.b == 65153809) {
                    a4 = (aicz)aomy.c;
                }
                else {
                    a4 = aicz.a;
                }
                if ((a4.b & 0x800000) != 0x0) {
                    aomy aomy2;
                    if ((aomy2 = aomx.e) == null) {
                        aomy2 = aomy.a;
                    }
                    aicz a5;
                    if (aomy2.b == 65153809) {
                        a5 = (aicz)aomy2.c;
                    }
                    else {
                        a5 = aicz.a;
                    }
                    wyw.J(3, (wzz)new wyt(a5.w), (alhi)null);
                }
                return;
            }
            case 14: {
                final Object a6 = this.a;
                final aczz aczz = (aczz)o;
                final byte[] byteArray = ((agzk)aczz.d).toByteArray();
                final Bundle bundle = (Bundle)a6;
                bundle.putByteArray("primary", byteArray);
                bundle.putStringArrayList("secondary", new ArrayList(aczz.e));
                bundle.putByteArray("initial_primary", ((agzk)aczz.b).toByteArray());
                bundle.putStringArrayList("initial_secondary", new ArrayList(aczz.c));
                final aone f = aczz.f;
                if (f != null) {
                    bundle.putByteArray("optimistic_primary", ((agzk)f).toByteArray());
                }
                final Set g = aczz.g;
                if (g != null) {
                    bundle.putStringArrayList("optimistic_secondary", new ArrayList(g));
                }
                return;
            }
            case 13: {
                final Object a7 = this.a;
                final aona aona = (aona)o;
                final fwm fwm = (fwm)a7;
                Optional.ofNullable((Object)fwm.d).ifPresent((Consumer)new fvj(aona, 11));
                fwm.e.g(aona);
                return;
            }
            case 12: {
                ((wyw)o).t((wzz)new wyt(((aona)this.a).e), (alhi)null);
                return;
            }
            case 11: {
                final Object a8 = this.a;
                final wyw wyw2 = (wyw)o;
                final aona aona2 = (aona)a8;
                if ((0x4 & aona2.b) != 0x0) {
                    wyw2.J(3, (wzz)new wyt(aona2.e), (alhi)null);
                }
                return;
            }
            case 10: {
                final Object a9 = this.a;
                final aona aona3 = (aona)o;
                final fwm fwm2 = (fwm)a9;
                fwm2.a.setVisibility(0);
                if ((aona3.b & 0x80) != 0x0) {
                    final acvw b = fwm2.b;
                    aomz aomz;
                    if ((aomz = aona3.j) == null) {
                        aomz = aomz.a;
                    }
                    akbo a10;
                    if (aomz.b == 102716411) {
                        a10 = (akbo)aomz.c;
                    }
                    else {
                        a10 = akbo.a;
                    }
                    final ImageView a11 = fwm2.a;
                    aomz aomz2;
                    if ((aomz2 = aona3.j) == null) {
                        aomz2 = aomz.a;
                    }
                    b.b(a10, (View)a11, (Object)aomz2, fwm2.d);
                }
                return;
            }
            case 9: {
                ((fwp)o).g((aomw)null, (wyw)this.a);
                return;
            }
            case 8: {
                ((fwm)o).b(null, (wyw)this.a);
                return;
            }
            case 7: {
                final Object a12 = this.a;
                final alaf alaf = (alaf)o;
                alad alad;
                if ((alad = alaf.f) == null) {
                    alad = alad.a;
                }
                if (alad.b == 102716411) {
                    final fvl fvl = (fvl)a12;
                    final fwl o2 = fvl.c.o;
                    if (o2 != null) {
                        Optional.ofNullable((Object)o2.b()).ifPresent((Consumer)new fvi(fvl, alaf, 4));
                    }
                }
                return;
            }
            case 6: {
                ((wyw)o).t((wzz)new wyt(((aome)this.a).D), (alhi)null);
                return;
            }
            case 5: {
                Optional.ofNullable((Object)((fvn)this.a).r).ifPresent((Consumer)new fvj((aome)o, 6));
                return;
            }
            case 4: {
                final Object a13 = this.a;
                final aome aome = (aome)o;
                final fvn fvn = (fvn)a13;
                Optional.ofNullable((Object)fvn.r).ifPresent((Consumer)new fvi(fvn, aome, 3));
                return;
            }
            case 3: {
                final Object a14 = this.a;
                final Map map = (Map)o;
                final Set a15 = fvn.a;
                ((Map)a14).putAll(map);
                return;
            }
            case 2: {
                final Object a16 = this.a;
                final wyw wyw3 = (wyw)o;
                final Set a17 = fvn.a;
                ((Map<String, wyw>)a16).put("com.google.android.libraries.youtube.logging.interaction_logger", wyw3);
                return;
            }
            case 1: {
                final Object a18 = this.a;
                final aome aome2 = (aome)o;
                final fvn fvn2 = (fvn)a18;
                final acvw m = fvn2.m;
                akbq akbq;
                if ((akbq = aome2.t) == null) {
                    akbq = akbq.a;
                }
                akbo a19;
                if (akbq.b == 102716411) {
                    a19 = (akbo)akbq.c;
                }
                else {
                    a19 = akbo.a;
                }
                m.b(a19, (View)fvn2.h, (Object)aome2, fvn2.r);
                return;
            }
            case 0: {
                final Object a20 = this.a;
                final boolean booleanValue = (boolean)o;
                final ahaz ahaz = (ahaz)a20;
                ahaz.copyOnWrite();
                final aome aome3 = (aome)ahaz.instance;
                final aome a21 = aome.a;
                aome3.b |= 0x400;
                aome3.l = booleanValue;
            }
        }
    }
    
    @Override
    public final Consumer andThen(final Consumer consumer) {
        switch (this.b) {
            default: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 19: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 18: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 17: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 16: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 15: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 14: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 13: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 12: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 11: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 10: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 9: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 8: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 7: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 6: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 5: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 4: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 3: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 2: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 1: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
            case 0: {
                return Consumer$_CC.$default$andThen((Consumer)this, consumer);
            }
        }
    }
}
