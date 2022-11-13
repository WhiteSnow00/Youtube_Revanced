import java.util.List;
import java.util.TreeSet;
import android.accessibilityservice.AccessibilityServiceInfo;
import java.util.Collection;
import android.content.Context;
import com.google.android.apps.youtube.app.player.overlay.accessibility.AccessibilityEventLogger$LifecycleObserver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class izz implements asjm
{
    public final AccessibilityEventLogger$LifecycleObserver a;
    
    public izz(final AccessibilityEventLogger$LifecycleObserver a) {
        this.a = a;
    }
    
    @Override
    public final void a(final Object o) {
        final AccessibilityEventLogger$LifecycleObserver a = this.a;
        final abbc abbc = (abbc)o;
        final jaa a2 = a.a;
        final afeq o2 = afeq.o((Collection)tsy.a((Context)a2.d.a).getEnabledAccessibilityServiceList(-1));
        final int size = ((List)o2).size();
        int i = 0;
        int j = 0;
        while (i < size) {
            j |= ((AccessibilityServiceInfo)((List)o2).get(i)).feedbackType;
            ++i;
        }
        final TreeSet set = new TreeSet();
        while (j != 0) {
            final int n = 1 << Integer.numberOfTrailingZeros(j);
            ahin ahin = ahin.a;
            if (n != 1) {
                if (n != 2) {
                    if (n != 4) {
                        if (n != 8) {
                            if (n != 16) {
                                if (n == 32) {
                                    ahin = ahin.g;
                                }
                            }
                            else {
                                ahin = ahin.c;
                            }
                        }
                        else {
                            ahin = ahin.f;
                        }
                    }
                    else {
                        ahin = ahin.b;
                    }
                }
                else {
                    ahin = ahin.d;
                }
            }
            else {
                ahin = ahin.e;
            }
            set.add(ahin);
            j &= ~n;
        }
        final aknr d = aknt.d();
        final ahio a3 = ahip.a();
        ((ahaz)a3).copyOnWrite();
        ahip.c((ahip)a3.instance, set);
        ((ahaz)d).copyOnWrite();
        aknt.cr((aknt)d.instance, (ahip)((ahaz)a3).build());
        a2.a.d((aknt)((ahaz)d).build());
    }
}
