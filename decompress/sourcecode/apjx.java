import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apjx extends agzi implements ahax
{
    public static final apjx a;
    private static volatile ahbe f;
    public String b;
    public String c;
    public ajsq d;
    public agzy e;
    private int g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(apjx.class, a = new apjx());
    }
    
    private apjx() {
        this.h = 2;
        this.b = "";
        this.c = "";
        this.e = agzi.emptyProtobufList();
    }
    
    @Override
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
                if ((f = apjx.f) == null) {
                    synchronized (apjx.class) {
                        if (apjx.f == null) {
                            apjx.f = (ahbe)new agzb((agzi)apjx.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apjx.a;
            }
            case 4: {
                return new agza((agzi)apjx.a);
            }
            case 3: {
                return new apjx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apjx.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001\u1008\u0000\u0002\u1409\u0002\u0003\u001a\u0004\u1008\u0001", new Object[] { "g", "b", "d", "e", "c" });
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
