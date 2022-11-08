import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akyd extends agzi implements ahax
{
    public static final akyd a;
    private static volatile ahbe g;
    public int b;
    public akjd c;
    public agzy d;
    public String e;
    public String f;
    private byte h;
    
    static {
        agzi.registerDefaultInstance((Class)akyd.class, (agzi)(a = new akyd()));
    }
    
    private akyd() {
        this.h = 2;
        this.d = agzi.emptyProtobufList();
        this.e = "";
        this.f = "";
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
                final ahbe g;
                if ((g = akyd.g) == null) {
                    synchronized (akyd.class) {
                        if (akyd.g == null) {
                            akyd.g = (ahbe)new agzb((agzi)akyd.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return akyd.a;
            }
            case 4: {
                return new agza((float[])null);
            }
            case 3: {
                return new akyd();
            }
            case 2: {
                return newMessageInfo((MessageLite)akyd.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001\u1409\u0000\u0002\u001a\u0003\u1008\u0001\u0004\u1008\u0002", new Object[] { "b", "c", "d", "e", "f" });
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
