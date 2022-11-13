import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import java.util.Map;
import java.util.Collections;
import j$.util.Optional;
import com.google.android.libraries.youtube.mdx.FeatureFlagsImpl;

// 
// Decompiled by Procyon v0.6.0
// 

public final class flr implements asjn
{
    public final Object a;
    private final int b;
    
    public flr(final FeatureFlagsImpl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public flr(final exi a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public flr(final ghb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public flr(final kcy a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public flr(final uxn a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public flr(final vfp a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final Object a(final Object o, final Object o2, final Object o3) {
        final int b = this.b;
        final boolean b2 = true;
        switch (b) {
            default: {
                final Object a = this.a;
                final Boolean b3 = (Boolean)o;
                final Boolean b4 = (Boolean)o2;
                final Boolean b5 = (Boolean)o3;
                final FeatureFlagsImpl featureFlagsImpl = (FeatureFlagsImpl)a;
                String.format("isUnder13Account=%b, restrictForUnder13=%b, isEduChildAccount=%b, retrictCastForEduChildAccount=%b", b3, featureFlagsImpl.c.i, b4, b5);
                if (!featureFlagsImpl.c.i || !b3) {
                    boolean b6 = b2;
                    if (!b4) {
                        return b6;
                    }
                    b6 = b2;
                    if (!b5) {
                        return b6;
                    }
                }
                return false;
            }
            case 6: {
                final Object a2 = this.a;
                final uxy uxy = (uxy)o;
                final Integer n = (Integer)o2;
                final Integer n2 = (Integer)o3;
                final int intValue = n;
                final int intValue2 = n2;
                final aezp b7 = uxy.b;
                ashi c;
                if (b7.h()) {
                    c = (ashi)b7.c();
                }
                else {
                    final int a3 = uxs.a(intValue2, 0, uxy.a);
                    final uxn uxn = (uxn)a2;
                    c = uxn.c(intValue, a3, (long)uxn.d, ashi.K((Object)0), uxn.a);
                }
                return c.L((asjr)uxu.b).l((auke)ashi.K((Object)aeyo.a));
            }
            case 5: {
                final Object a4 = this.a;
                final uxy uxy2 = (uxy)o;
                final Integer n3 = (Integer)o2;
                final Integer n4 = (Integer)o3;
                final int intValue3 = n3;
                final int intValue4 = n4;
                final aezp b8 = uxy2.b;
                ashi c2;
                if (b8.h()) {
                    c2 = (ashi)b8.c();
                }
                else {
                    final uxx a5 = uxy2.a;
                    final uxn uxn2 = (uxn)a4;
                    c2 = uxn2.c(intValue3, uxs.a(uxn2.b.b().bottom, intValue4, a5), (long)uxn2.d, uxn2.a(), uxn.a);
                }
                return c2.L((asjr)uxu.b).l((auke)ashi.K((Object)aeyo.a));
            }
            case 4: {
                final Object a6 = this.a;
                final int intValue5 = (int)o;
                final int intValue6 = (int)o2;
                final int intValue7 = (int)o3;
                int min = intValue5 + intValue6;
                if (intValue7 == 1) {
                    min = Math.min(min, ((uxn)a6).b.b().bottom);
                }
                return min;
            }
            case 3: {
                final Object a7 = this.a;
                final ggv ggv = (ggv)o;
                final Boolean b9 = (Boolean)o2;
                final fkr fkr = (fkr)o3;
                final boolean booleanValue = b9;
                lcz lcz;
                if (!booleanValue && fkr == fkr.c) {
                    lcz = lcz.d;
                }
                else {
                    if (fkr == fkr.b) {
                        final PaneDescriptor d = ((ghb)a7).d();
                        if (d != null && d.n()) {
                            lcz = lcz.b;
                            return lcz;
                        }
                        if (booleanValue) {
                            lcz = lcz.c;
                            return lcz;
                        }
                    }
                    lcz = lcz.a;
                }
                return lcz;
            }
            case 2: {
                return ((kcy)this.a).a((CharSequence)o, (Optional)o2, (Optional)o3);
            }
            case 1: {
                final Object a8 = this.a;
                final exb exb = (exb)o;
                final exd exd = (exd)o2;
                final String s = (String)o3;
                final Map<Object, Object> unmodifiableMap = Collections.unmodifiableMap((Map<?, ?>)exd.b);
                exb exb2;
                exi exi;
                if (unmodifiableMap.containsKey(s) && unmodifiableMap.get(s) != null) {
                    exb2 = unmodifiableMap.get(s);
                    exi = (exi)a8;
                }
                else {
                    final exi exi2 = (exi)a8;
                    exb2 = exb;
                    exi = exi2;
                }
                return exi.a(exb2);
            }
            case 0: {
                final Object a9 = this.a;
                final asht z = ((asht)o).K((asjs)new fdp((afft)o2, 2)).K((asjs)new fdp((afft)o3, 3)).Z((asjr)flq.j);
                a9.getClass();
                return z.u((asjr)new fdg((vfp)a9, 8));
            }
        }
    }
}
