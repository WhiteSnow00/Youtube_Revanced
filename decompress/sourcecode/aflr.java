import java.io.IOException;
import java.util.Formatter;
import java.util.Formattable;
import java.math.BigInteger;
import java.math.BigDecimal;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aflr implements afln
{
    public int a;
    public int b;
    public final Object[] c;
    public final StringBuilder d;
    public int e;
    private final afkp f;
    
    public aflr(final afkp f, final Object[] array, final StringBuilder d) {
        this.a = 0;
        this.b = -1;
        alhb.K((Object)f, "context");
        this.f = f;
        this.e = 0;
        this.c = (Object[])alhb.K((Object)array, "arguments");
        this.d = d;
    }
    
    public static void d(final StringBuilder sb, final Object o, final String s) {
        sb.append("[INVALID: format=");
        sb.append(s);
        sb.append(", type=");
        sb.append(o.getClass().getCanonicalName());
        sb.append(", value=");
        sb.append(afjr.b(o));
        sb.append("]");
    }
    
    public final void a(Object o, afjk afjk, final afjl afjl) {
        final int ordinal = ((Enum)afjk.m).ordinal();
        int n = 4;
        int n2 = 2;
        final int n3 = 1;
        if (ordinal != 0) {
            boolean validCodePoint = false;
            Label_0172: {
                if (ordinal != 1) {
                    Label_0124: {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal != 4) {
                                    throw null;
                                }
                                if (o instanceof Double || o instanceof Float) {
                                    break Label_0124;
                                }
                                if (o instanceof BigDecimal) {
                                    break Label_0124;
                                }
                            }
                            else {
                                if (o instanceof Integer || o instanceof Long || o instanceof Byte || o instanceof Short) {
                                    break Label_0124;
                                }
                                if (o instanceof BigInteger) {
                                    break Label_0124;
                                }
                            }
                        }
                        else {
                            if (o instanceof Character) {
                                break Label_0124;
                            }
                            if (o instanceof Integer || o instanceof Byte || o instanceof Short) {
                                validCodePoint = Character.isValidCodePoint(((Number)o).intValue());
                                break Label_0172;
                            }
                        }
                        validCodePoint = false;
                        break Label_0172;
                    }
                    validCodePoint = true;
                }
                else {
                    validCodePoint = (o instanceof Boolean);
                }
            }
            if (!validCodePoint) {
                d(this.d, o, afjk.o);
                return;
            }
        }
        final StringBuilder d = this.d;
        final int ordinal2 = afjk.ordinal();
        Label_0586: {
            if (ordinal2 != 0) {
                if (ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        if (ordinal2 != 3) {
                            if (ordinal2 != 5) {
                                break Label_0586;
                            }
                            afjl a = null;
                            Label_0316: {
                                if (!afjl.c()) {
                                    final int b = afjl.b;
                                    final int n4 = b & 0x80;
                                    if (n4 == 0) {
                                        a = afjl.a;
                                        break Label_0316;
                                    }
                                    if (n4 != b || afjl.c != -1 || afjl.d != -1) {
                                        a = new afjl(n4, -1, -1);
                                        break Label_0316;
                                    }
                                }
                                a = afjl;
                            }
                            if (!a.equals((Object)afjl)) {
                                break Label_0586;
                            }
                            final Number n5 = (Number)o;
                            final boolean d2 = afjl.d();
                            final long longValue = n5.longValue();
                            if (n5 instanceof Long) {
                                afjr.c(d, longValue, d2);
                                return;
                            }
                            if (n5 instanceof Integer) {
                                afjr.c(d, longValue & 0xFFFFFFFFL, d2);
                                return;
                            }
                            if (n5 instanceof Byte) {
                                afjr.c(d, longValue & 0xFFL, d2);
                                return;
                            }
                            if (n5 instanceof Short) {
                                afjr.c(d, longValue & 0xFFFFL, d2);
                                return;
                            }
                            if (n5 instanceof BigInteger) {
                                String s = ((BigInteger)n5).toString(16);
                                if (d2) {
                                    s = s.toUpperCase(afjr.a);
                                }
                                d.append(s);
                                return;
                            }
                            throw new IllegalStateException("unsupported number type: ".concat(String.valueOf(String.valueOf(((BigInteger)n5).getClass()))));
                        }
                    }
                    else {
                        if (!afjl.c()) {
                            break Label_0586;
                        }
                        if (o instanceof Character) {
                            d.append(o);
                            return;
                        }
                        final int intValue = ((Number)o).intValue();
                        if (intValue >>> 16 == 0) {
                            d.append((char)intValue);
                            return;
                        }
                        d.append(Character.toChars(intValue));
                        return;
                    }
                }
                if (afjl.c()) {
                    d.append(o);
                    return;
                }
            }
            else if (!(o instanceof Formattable)) {
                if (afjl.c()) {
                    d.append(afjr.b(o));
                    return;
                }
            }
            else {
                o = o;
                final int n6 = afjl.b & 0xA2;
                int n7;
                if ((n7 = n6) != 0) {
                    int n8;
                    if ((n6 & 0x20) != 0x0) {
                        n8 = n3;
                    }
                    else {
                        n8 = 0;
                    }
                    if ((n6 & 0x80) == 0x0) {
                        n2 = 0;
                    }
                    if ((n6 & 0x2) == 0x0) {
                        n = 0;
                    }
                    n7 = (n8 | n2 | n);
                }
                final int length = d.length();
                afjk = (afjk)new Formatter(d, afjr.a);
                try {
                    ((Formattable)o).formatTo((Formatter)afjk, n7, afjl.c, afjl.d);
                    return;
                }
                catch (final RuntimeException ex) {
                    d.setLength(length);
                    try {
                        ((Formatter)afjk).out().append(afjr.a(o, ex));
                        return;
                    }
                    catch (final IOException ex2) {}
                }
            }
        }
        String s2 = afjk.o;
        if (!afjl.c()) {
            int l;
            final char c = (char)(l = afjk.l);
            if (afjl.d()) {
                l = (c & '\uffdf');
            }
            final StringBuilder sb = new StringBuilder("%");
            afjl.f(sb);
            sb.append((char)l);
            s2 = sb.toString();
        }
        d.append(String.format(afjr.a, s2, o));
    }
    
    public final afls b() {
        return this.f.a;
    }
    
    public final String c() {
        return this.f.b;
    }
}
