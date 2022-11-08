import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqp extends agzi implements ahax
{
    public static final apqp a;
    private static volatile ahbe f;
    public int b;
    public String c;
    public int d;
    public String e;
    private aioe g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance((Class)apqp.class, (agzi)(a = new apqp()));
    }
    
    private apqp() {
        this.h = 2;
        this.c = "";
        this.e = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = apqp.f) == null) {
                    synchronized (apqp.class) {
                        if (apqp.f == null) {
                            apqp.f = (ahbe)new agzb((agzi)apqp.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apqp.a;
            }
            case 4: {
                return new agza((agzi)apqp.a);
            }
            case 3: {
                return new apqp();
            }
            case 2: {
                return newMessageInfo((MessageLite)apqp.a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u100b\u0001\u0004\u1008\u0002\u0006\u1409\u0004", new Object[] { "b", "c", "d", "e", "g" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
