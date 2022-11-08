import java.util.Iterator;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.BitSet;
import java.util.Locale;
import java.util.ArrayList;
import java.util.concurrent.TimeoutException;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

final class aejo implements afsz
{
    final /* synthetic */ ListenableFuture a;
    final /* synthetic */ String b;
    
    public aejo(final ListenableFuture a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public final void b(final Object o) {
    }
    
    public final void rz(final Throwable t) {
        if (t instanceof TimeoutException && !this.a.isDone()) {
            afii afii = (afii)((afig)aejp.a).g();
            final aerr a = aesw.a();
            final aesr aesr = new aesr(t, aesr.c(a, (aerr)null));
            afii afii2 = afii;
            if (a instanceof aeqw) {
                aeqw aeqw = (aeqw)a;
                final aesn f = aeqw.f();
                final ArrayList list = new ArrayList();
                final ArrayList list2 = new ArrayList();
                for (final aerd aerd : f.e) {
                    if ((aerd.b & 0x20) == 0x0) {
                        list2.add(aerd);
                    }
                }
                if (list2.isEmpty()) {
                    list.add(new StackTraceElement("tk_trace", "No unfinished spans when the app crashed:", null, 0));
                }
                aeqb aeqb;
                if ((aeqb = f.h) == null) {
                    aeqb = aeqb.a;
                }
                if ((aeqb.b & 0x1) != 0x0) {
                    final Locale us = Locale.US;
                    final String c = f.e.get(0).c;
                    aeqb aeqb2;
                    if ((aeqb2 = f.h) == null) {
                        aeqb2 = aeqb.a;
                    }
                    aeqa aeqa;
                    if ((aeqa = aeqb2.c) == null) {
                        aeqa = aeqa.a;
                    }
                    list.add(new StackTraceElement("tk_trace", String.format(us, "Trace %s tried to log too many spans. %s spans dropped", c, aeqa.c), null, 0));
                }
                aerr aerr = null;
                Label_0338: {
                    if (!list.isEmpty()) {
                        aesr.e((Throwable)aesr, (StackTraceElement[])list.toArray(new StackTraceElement[0]));
                        aerr = (aerr)aeqw;
                    }
                    else {
                        final int e = aeqw.e();
                        final StackTraceElement[] array = new StackTraceElement[f.e.size()];
                        final BitSet set = new BitSet();
                        Iterator iterator2 = adwd.ap(f.e).iterator();
                        int n = 0;
                        afii afii3 = afii;
                        ArrayList list3 = null;
                    Label_0599_Outer:
                        while (true) {
                            afii = afii3;
                            aerr = (aerr)aeqw;
                            if (!iterator2.hasNext()) {
                                break Label_0338;
                            }
                            final aerd aerd2 = (aerd)iterator2.next();
                            afii = afii3;
                            aerr = (aerr)aeqw;
                            if (aerd2.d < e) {
                                break Label_0338;
                            }
                            list3 = new ArrayList();
                            if (n >= 10) {
                                break;
                            }
                            final int d = aerd2.d;
                            int n3 = 0;
                            Label_0902: {
                                if (array[d] == null && (aerd2.b & 0x20) == 0x0 && !set.get(d)) {
                                    int d2 = aerd2.d;
                                    int n2 = -1;
                                    while (true) {
                                        while (!set.get(d2)) {
                                            final aerd aerd3 = f.e.get(d2);
                                            if (aerd3 == null) {
                                                list3.add(new StackTraceElement("tk_trace", "Orphaned Root", null, 0));
                                            }
                                            else {
                                                if (array[aerd3.d] == null) {
                                                    final String c2 = aerd3.c;
                                                    String string;
                                                    if ((aerd3.b & 0x20) != 0x0) {
                                                        final long g = aerd3.g;
                                                        final StringBuilder sb = new StringBuilder(" ");
                                                        sb.append(g);
                                                        sb.append(" ms");
                                                        string = sb.toString();
                                                    }
                                                    else {
                                                        string = "(unfinished)";
                                                    }
                                                    array[aerd3.d] = new StackTraceElement("tk_trace", String.valueOf(c2).concat(string), null, 0);
                                                }
                                                list3.add(array[aerd3.d]);
                                                final int e2 = aerd3.e;
                                                if (e2 >= e) {
                                                    n2 = d2;
                                                    d2 = e2;
                                                    continue Label_0599_Outer;
                                                }
                                                n2 = d2;
                                            }
                                            final afii afii4 = afii3;
                                            final aeqw aeqw2 = aeqw;
                                            final Iterator iterator3 = iterator2;
                                            if (n2 == e) {
                                                n3 = n + 1;
                                                aesr.e((Throwable)aesr, (StackTraceElement[])list3.toArray(new StackTraceElement[0]));
                                                iterator2 = iterator3;
                                                aeqw = aeqw2;
                                                afii3 = afii4;
                                                break Label_0902;
                                            }
                                            final agzy e3 = f.e;
                                            int n4 = aerd2.d;
                                            aerd aerd4;
                                            do {
                                                aerd4 = e3.get(n4);
                                                n3 = n;
                                                iterator2 = iterator3;
                                                aeqw = aeqw2;
                                                afii3 = afii4;
                                                if (set.get(n4)) {
                                                    break Label_0902;
                                                }
                                                set.set(aerd4.d);
                                            } while ((n4 = aerd4.e) != -1);
                                            n3 = n;
                                            iterator2 = iterator3;
                                            aeqw = aeqw2;
                                            afii3 = afii4;
                                            break Label_0902;
                                        }
                                        continue;
                                    }
                                }
                                n3 = n;
                            }
                            n = n3;
                        }
                        list3.add(new StackTraceElement("tk_trace", "Suppressed exceptions exceeds the limit 10, additional unfinished spans will not be reported", null, 0));
                        aesr.e((Throwable)aesr, (StackTraceElement[])list3.toArray(new StackTraceElement[0]));
                        afii = afii3;
                        aerr = (aerr)aeqw;
                    }
                }
                final Map i = aesw.i();
                final BitSet set2 = new BitSet();
                final BitSet set3 = new BitSet();
                for (final Map.Entry<K, aerr> entry : i.entrySet()) {
                    final aerr aerr2 = entry.getValue();
                    final Thread thread = (Thread)entry.getKey();
                    if (thread != Thread.currentThread() && aerr2 instanceof aeqw) {
                        final aeqw aeqw3 = (aeqw)aerr2;
                        if (!((aerr)aeqw3).d().equals(aerr.d()) || aeqw3.e() <= ((aeqw)aerr).e()) {
                            continue;
                        }
                        final agzy e4 = ((aeqw)aerr).f().e;
                        int e5 = aeqw3.e();
                        final BitSet set4 = new BitSet();
                        while (!set3.get(e5) || set2.get(e5)) {
                            if (set2.get(e5)) {
                                set2.or(set4);
                            }
                            else {
                                set3.set(e5);
                                set4.set(e5);
                                final int e6 = e4.get(e5).e;
                                if ((e5 = e6) > ((aeqw)aerr).e()) {
                                    continue;
                                }
                                if (e6 == ((aeqw)aerr).e()) {
                                    set2.or(set4);
                                }
                                if (e6 != ((aeqw)aerr).e()) {
                                    break;
                                }
                            }
                            final odj odj = new odj(thread);
                            odj.initCause((Throwable)new aesr((Throwable)null, aesr.c(aerr2, aerr.a())));
                            final ArrayList list4 = new ArrayList();
                            list4.add(new StackTraceElement(odj.getMessage(), "", null, 0));
                            Collections.addAll(list4, odj.getStackTrace());
                            final StackTraceElement[] array2 = (StackTraceElement[])list4.toArray(new StackTraceElement[0]);
                            alhb.Q((Throwable)aesr, (Throwable)odj);
                            break;
                        }
                    }
                }
                afii2 = afii;
            }
            ((afii)((afii)afii2.i((Throwable)aesr)).j("com/google/apps/tiktok/concurrent/AndroidFutures$1", "onFailure", 183, "AndroidFutures.java")).t("exceeded timeout: %s", (Object)this.b);
        }
    }
}
