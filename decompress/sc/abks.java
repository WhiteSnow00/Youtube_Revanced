import java.util.List;
import java.util.Iterator;
import java.io.IOException;
import java.io.File;
import java.util.function.Supplier;
import android.util.Pair;
import com.google.apps.tiktok.account.AccountId;
import java.util.Map;
import java.util.Collections;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abks implements aezf
{
    public final Object a;
    public final Object b;
    private final int c;
    
    public abks(final abku a, final abjt b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public abks(final abvz b, final Class a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public abks(final acid b, final aanj a, final int c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public abks(final aded b, final adep a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public abks(final adeg a, final aded b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public abks(final adrh a, final adqk b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public abks(final aeok b, final acqb a, final int c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public abks(final aezf b, final AtomicReference a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public abks(final String a, final aekf b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public abks(final String b, final String a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public final Object apply(Object o) {
        final int c = this.c;
        int i = 0;
        final Boolean value = false;
        switch (c) {
            default: {
                final Object b = this.b;
                final Object a = this.a;
                final Throwable t = (Throwable)o;
                if (!(t instanceof CancellationException)) {
                    final acqb acqb = (acqb)a;
                    acqb.g();
                    ((aeok)b).c(acqb);
                    return null;
                }
                throw (CancellationException)t;
            }
            case 10: {
                o = this.b;
                final acqb acqb2 = (acqb)this.a;
                acqb2.g();
                ((aeok)o).c(acqb2);
                return null;
            }
            case 9: {
                final Object b2 = this.b;
                final Object a2 = this.a;
                for (final aelf aelf : Collections.unmodifiableMap((Map<?, ? extends aelf>)((aelc)o).d).values()) {
                    aejz aejz;
                    if ((aejz = aelf.d) == null) {
                        aejz = aejz.a;
                    }
                    if (aejz.i.equals(b2)) {
                        aejz aejz2;
                        if ((aejz2 = aelf.d) == null) {
                            aejz2 = aejz.a;
                        }
                        if (!aejz2.c.equals(a2)) {
                            continue;
                        }
                        final int h = aevy.h(aelf.e);
                        if (h != 0 && h == 2) {
                            return AccountId.b(aelf.c);
                        }
                        o = new StringBuilder("account of type ");
                        ((StringBuilder)o).append((String)b2);
                        ((StringBuilder)o).append(" is not enabled");
                        throw new aekl(((StringBuilder)o).toString());
                    }
                }
                throw new aekl("No account is found for ".concat((String)b2));
            }
            case 8: {
                final Object b3 = this.b;
                final Object a3 = this.a;
                final Pair pair = (Pair)((aezf)b3).apply((Object)o);
                o = pair.first;
                ((AtomicReference<Object>)a3).set(o);
                return pair.second;
            }
            case 7: {
                final Object b4 = this.b;
                final Object a4 = this.a;
                for (final aelf aelf2 : Collections.unmodifiableMap((Map<?, ? extends aelf>)((aelc)o).d).values()) {
                    aejz aejz3;
                    if ((aejz3 = aelf2.d) == null) {
                        aejz3 = aejz.a;
                    }
                    if (aejz3.i.equals(b4)) {
                        aejz aejz4;
                        if ((aejz4 = aelf2.d) == null) {
                            aejz4 = aejz.a;
                        }
                        if (aejz4.c.equals(a4)) {
                            return AccountId.b(aelf2.c);
                        }
                        continue;
                    }
                }
                throw new aekl("No account is found for ".concat((String)b4));
            }
            case 6: {
                final Object a5 = this.a;
                final Object b5 = this.b;
                afeq afeq;
                for (afeq = (afeq)o; i < ((List)afeq).size(); ++i) {
                    final aejz aejz5 = (aejz)((List)afeq).get(i);
                    adkp.X(((String)a5).equals(aejz5.i), "AccountProvider %s provides account(s) of different type from the declared one. Declared type: %s provided type: %s", b5, a5, (Object)aejz5.i);
                }
                return afeq;
            }
            case 5: {
                final Object a6 = this.a;
                final Object b6 = this.b;
                final adqt adqt = (adqt)o;
                final adrh adrh = (adrh)a6;
                adrh.g("beginCoWatching");
                adkp.R(adrh.e.isPresent() ^ true, (Object)"Unexpected call to beginCoWatching during an existing co-watching activity.");
                return adrd.c((Supplier)new igs(adrh, (adqk)b6, 4), "Unexpected error when trying to begin co-watching.");
            }
            case 4: {
                final Object a7 = this.a;
                final Object b7 = this.b;
                final byte[] array = (byte[])o;
                o = a7;
                ((adeg)o).f();
                final String a8 = ((adeg)o).a;
                final int andIncrement = ((adeg)o).b.getAndIncrement();
                final StringBuilder sb = new StringBuilder();
                sb.append(andIncrement);
                sb.append(".tmp");
                final File file = new File(a8, sb.toString());
                try {
                    final File file2 = new File(((adeg)a7).a, adds.e((aded)b7));
                    afpj.b(file);
                    afpo.b(array, file, afft.q((Object[])new afph[] { afph.a }));
                    afpj.b(file2);
                    adeg.d(file, file2);
                    return null;
                }
                catch (final InterruptedException ex) {
                    Thread.currentThread().interrupt();
                    throw new RuntimeException("Unexpected error occurred while trying to persist data for: ".concat(b7.toString()));
                }
                catch (final IOException ex2) {
                    ((adeg)o).e((afaq)new yuk(file, 17));
                    ((adeg)o).f();
                    throw new RuntimeException("Unexpected error when writing the value for: ".concat(b7.toString()), ex2);
                }
            }
            case 3: {
                final Object b8 = this.b;
                final Object a9 = this.a;
                final byte[] array2 = (byte[])o;
                if (array2 != null) {
                    try {
                        o = ((adep)a9).a(array2);
                        return o;
                    }
                    catch (final IOException ex3) {
                        throw new IllegalArgumentException("An error occurred while unmarshalling the value for".concat(b8.toString()), ex3);
                    }
                }
                throw new adee("Could not find any value for: ".concat(b8.toString()));
            }
            case 2: {
                final Object b9 = this.b;
                final Object a10 = this.a;
                final abvy abvy = (abvy)o;
                Boolean value2 = value;
                if (((Class)a10).isInstance(abvy)) {
                    final abvz abvz = (abvz)b9;
                    if (abvz.a) {
                        abvz.b.add(abvy);
                        value2 = value;
                    }
                    else {
                        value2 = true;
                    }
                }
                return value2;
            }
            case 1: {
                final Object b10 = this.b;
                final Object a11 = this.a;
                final aezp aezp = (aezp)o;
                if (aezp != null && aezp.h()) {
                    ((aabo)((acid)b10).d).a().k().g(((aanj)a11).a());
                }
                return null;
            }
            case 0: {
                final Object a12 = this.a;
                final Object b11 = this.b;
                final ablo ablo = (ablo)o;
                return ((abku)a12).a.l(ablo.a, ablo.c, ablo.d, (abjt)b11);
            }
        }
    }
}
