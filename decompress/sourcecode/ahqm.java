import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahqm extends agzi implements ahax
{
    public static final ahqm a;
    private static volatile ahbe g;
    public int b;
    public String c;
    public String d;
    public String e;
    public agzy f;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(ahqm.class, a = new ahqm());
    }
    
    private ahqm() {
        this.h = 2;
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = agzi.emptyProtobufList();
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
                final ahbe g;
                if ((g = ahqm.g) == null) {
                    synchronized (ahqm.class) {
                        if (ahqm.g == null) {
                            ahqm.g = (ahbe)new agzb((agzi)ahqm.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ahqm.a;
            }
            case 4: {
                return new agza((agzi)ahqm.a);
            }
            case 3: {
                return new ahqm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahqm.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u041b", new Object[] { "b", "c", "d", "e", "f", aliq.class });
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
