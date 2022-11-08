import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahpb extends agzi implements ahax
{
    public static final ahpb a;
    private static volatile ahbe e;
    public String b;
    public aioe c;
    public ahpc d;
    private int f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(ahpb.class, a = new ahpb());
    }
    
    private ahpb() {
        this.g = 2;
        this.b = "";
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
                final ahbe e;
                if ((e = ahpb.e) == null) {
                    synchronized (ahpb.class) {
                        if (ahpb.e == null) {
                            ahpb.e = (ahbe)new agzb((agzi)ahpb.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahpb.a;
            }
            case 4: {
                return new agza((agzi)ahpb.a);
            }
            case 3: {
                return new ahpb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahpb.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1409\u0001\u0003\u1009\u0002", new Object[] { "f", "b", "c", "d" });
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
