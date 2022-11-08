import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahpv extends agzi implements ahax
{
    public static final ahpv a;
    private static volatile ahbe g;
    public int b;
    public String c;
    public String d;
    public agzy e;
    public aioe f;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(ahpv.class, a = new ahpv());
    }
    
    private ahpv() {
        this.h = 2;
        this.c = "";
        this.d = "";
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
                final ahbe g;
                if ((g = ahpv.g) == null) {
                    synchronized (ahpv.class) {
                        if (ahpv.g == null) {
                            ahpv.g = (ahbe)new agzb((agzi)ahpv.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ahpv.a;
            }
            case 4: {
                return new agza((agzi)ahpv.a);
            }
            case 3: {
                return new ahpv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahpv.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u041b\u0004\u1409\u0002", new Object[] { "b", "c", "d", "e", aliq.class, "f" });
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
