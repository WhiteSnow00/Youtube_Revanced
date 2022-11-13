import java.util.Iterator;
import android.app.Activity;
import com.google.android.apps.youtube.app.common.ui.pip.observer.PipPlayerObserver;
import com.google.android.apps.youtube.app.extensions.reel.watch.fragment.ReelBottomBarUpdatedListener;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hly implements Callable
{
    public final Object a;
    public final Object b;
    private final int c;
    
    public hly(final abem b, final vai a, final int c, final byte[] array, final byte[] array2) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public hly(final ReelBottomBarUpdatedListener a, final PipPlayerObserver b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public hly(final ReelBottomBarUpdatedListener b, final vai a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public hly(final hnk b, final vai a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public hly(final how b, final hsi a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public hly(final hpe a, final hog b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public hly(final hpo a, final hog b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public hly(final hpo a, final hpb b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public hly(final hpq b, final asht a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public hly(final hpy b, final vai a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public hly(final hqh b, final vai a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public hly(final htk a, final Activity b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public hly(final ims b, final imt a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public hly(final vfw b, final aaat a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public hly(final vfw b, final String a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final Object call() {
        switch (this.c) {
            default: {
                final Object b = this.b;
                final imt imt = (imt)this.a;
                final String a = imt.a;
                final anyv anyv = (anyv)((iqv)((ims)b).a.a(imt).get(0)).a;
                if (anyv != null) {
                    for (final anyy anyy : anyv.d) {
                        if ((anyy.b & 0x10) != 0x0) {
                            alke alke;
                            if ((alke = anyy.j) == null) {
                                alke = alke.a;
                            }
                            if (a.equals(alke.i)) {
                                return new imr((anyv)null, alke);
                            }
                            continue;
                        }
                    }
                    alke alke = null;
                    return new imr((anyv)null, alke);
                }
                return new imr((anyv)null, (alke)null);
            }
            case 19: {
                ((vfw)this.b).g(glb.W((String)this.a));
                return null;
            }
            case 18: {
                ((vfw)this.b).g(glb.P((String)this.a));
                return null;
            }
            case 17: {
                ((vfw)this.b).g(glb.O((String)this.a));
                return null;
            }
            case 16: {
                ((vfw)this.b).g(glb.M((String)this.a));
                return null;
            }
            case 15: {
                ((vfw)this.b).j((vfk)iee.k((aaat)this.a));
                return null;
            }
            case 14: {
                ((vfw)this.b).j((vfk)ied.k((aaat)this.a));
                return null;
            }
            case 13: {
                ((vfw)this.b).g(glb.R((String)this.a));
                return null;
            }
            case 12: {
                final Object a2 = this.a;
                final Object b2 = this.b;
                final htk htk = (htk)a2;
                return ((vai)((ziy)htk.d).d).l(45357036L).af((asid)htk.a).aH((asjm)new hsf((Activity)b2, 2));
            }
            case 11: {
                return ((vai)this.a).l(45365467L).aH((asjm)new hom((hqh)this.b, 15));
            }
            case 10: {
                return ((vai)this.a).aG().aH((asjm)new hom((hpy)this.b, 13));
            }
            case 9: {
                return ((asht)this.a).aH((asjm)new hom((hpq)this.b, 11));
            }
            case 8: {
                final Object a3 = this.a;
                final asht x = ((hog)this.b).x();
                final hpo hpo = (hpo)a3;
                return x.af(hpo.af).aH((asjm)new hom(hpo, 9));
            }
            case 7: {
                final Object a4 = this.a;
                final asht o = ((hpb)this.b).o();
                final hpo hpo2 = (hpo)a4;
                return o.af(hpo2.af).aH((asjm)new hom(hpo2, 10));
            }
            case 6: {
                final Object a5 = this.a;
                final asht w = ((hog)this.b).w();
                final hpe hpe = (hpe)a5;
                return w.af(hpe.a).aH((asjm)new hom(hpe, 8));
            }
            case 5: {
                return ((hsi)this.a).a().aH((asjm)new hom((how)this.b, 4));
            }
            case 4: {
                return ((vai)this.a).l(45365257L).aH((asjm)new hfi((abem)this.b, 16, (byte[])null, (byte[])null));
            }
            case 3: {
                return ((vai)this.a).l(45363440L).aH((asjm)new hfi((hnk)this.b, 14));
            }
            case 2: {
                return ((vai)this.a).aG().aH((asjm)new hfi((hnk)this.b, 15));
            }
            case 1: {
                return ((vai)this.a).l(45362485L).aH((asjm)new hfi((ReelBottomBarUpdatedListener)this.b, 10));
            }
            case 0: {
                return ((PipPlayerObserver)this.b).a.aH((asjm)new hfi((ReelBottomBarUpdatedListener)this.a, 9));
            }
        }
    }
}
