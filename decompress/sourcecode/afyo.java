import java.util.Map;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afyo
{
    public static final afyo a;
    private final AtomicReference b;
    
    static {
        a = new afyo();
    }
    
    public afyo() {
        this.b = new AtomicReference((V)new ahar().d());
    }
    
    public final afus a(final afyr afyr) {
        try {
            final ahar ahar = this.b.get();
            final afyu afyu = new afyu(afyr.getClass(), afyr.b);
            if (((Map)ahar.c).containsKey(afyu)) {
                return ((afyh)((atdo)((Map<Object, Object>)ahar.c).get(afyu)).c).a((afyt)afyr);
            }
            final String string = afyu.toString();
            final StringBuilder sb = new StringBuilder("No Key Parser for requested key type ");
            sb.append(string);
            sb.append(" available");
            throw new GeneralSecurityException(sb.toString());
        }
        catch (final GeneralSecurityException ex) {
            try {
                return (afus)new afym(afyr);
            }
            catch (final GeneralSecurityException ex2) {
                throw new afyw(ex2);
            }
        }
    }
    
    public final void b(final atdo atdo) {
        synchronized (this) {
            final ahar ahar = new ahar((ahar)this.b.get(), (byte[])null);
            final afyu afyu = new afyu((Class)atdo.a, (ageq)atdo.b);
            if (((Map)ahar.c).containsKey(afyu)) {
                final atdo atdo2 = ((Map<K, atdo>)ahar.c).get(afyu);
                if (!atdo2.equals(atdo) || !atdo.equals(atdo2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(afyu.toString()));
                }
            }
            else {
                ((Map<afyu, atdo>)ahar.c).put(afyu, atdo);
            }
            this.b.set(ahar.d());
        }
    }
    
    public final void c(final ahbd ahbd) {
        synchronized (this) {
            final ahar ahar = new ahar((ahar)this.b.get(), (byte[])null);
            final afyv afyv = new afyv((Class)ahbd.b, (Class)ahbd.a);
            if (((Map)ahar.b).containsKey(afyv)) {
                final ahbd ahbd2 = ((Map<K, ahbd>)ahar.b).get(afyv);
                if (!ahbd2.equals(ahbd) || !ahbd.equals(ahbd2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(afyv.toString()));
                }
            }
            else {
                ((Map<afyv, ahbd>)ahar.b).put(afyv, ahbd);
            }
            this.b.set(ahar.d());
        }
    }
    
    public final void d(final ahbd ahbd) {
        synchronized (this) {
            final ahar ahar = new ahar((ahar)this.b.get(), (byte[])null);
            final afyu afyu = new afyu((Class)ahbd.a, (ageq)ahbd.b);
            if (((Map)ahar.a).containsKey(afyu)) {
                final ahbd ahbd2 = ((Map<K, ahbd>)ahar.a).get(afyu);
                if (!ahbd2.equals(ahbd) || !ahbd.equals(ahbd2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(afyu.toString()));
                }
            }
            else {
                ((Map<afyu, ahbd>)ahar.a).put(afyu, ahbd);
            }
            this.b.set(ahar.d());
        }
    }
    
    public final void e(final ahbd ahbd) {
        synchronized (this) {
            final ahar ahar = new ahar((ahar)this.b.get(), (byte[])null);
            final afyv afyv = new afyv((Class)ahbd.b, (Class)ahbd.a);
            if (((Map)ahar.d).containsKey(afyv)) {
                final ahbd ahbd2 = ((Map<K, ahbd>)ahar.d).get(afyv);
                if (!ahbd2.equals(ahbd) || !ahbd.equals(ahbd2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(afyv.toString()));
                }
            }
            else {
                ((Map<afyv, ahbd>)ahar.d).put(afyv, ahbd);
            }
            this.b.set(ahar.d());
        }
    }
}
