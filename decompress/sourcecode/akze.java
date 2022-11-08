import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akze extends agzi implements ahax
{
    public static final akze a;
    private static volatile ahbe f;
    public int b;
    public akjd c;
    public String d;
    public String e;
    private byte g;
    
    static {
        agzi.registerDefaultInstance((Class)akze.class, (agzi)(a = new akze()));
    }
    
    private akze() {
        this.g = 2;
        this.d = "";
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
                if ((f = akze.f) == null) {
                    synchronized (akze.class) {
                        if (akze.f == null) {
                            akze.f = (ahbe)new agzb((agzi)akze.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akze.a;
            }
            case 4: {
                return new agza((agzi)akze.a);
            }
            case 3: {
                return new akze();
            }
            case 2: {
                return newMessageInfo((MessageLite)akze.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u1008\u0002", new Object[] { "b", "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
