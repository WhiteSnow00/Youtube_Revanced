import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahpf extends agzi implements ahax
{
    public static final ahpf a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private aibc f;
    private ahfw g;
    private aioe h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance(ahpf.class, a = new ahpf());
    }
    
    private ahpf() {
        this.i = 2;
        emptyProtobufList();
        emptyProtobufList();
        final agyc b = agyc.b;
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
                final ahbe b2;
                if ((b2 = ahpf.b) == null) {
                    synchronized (ahpf.class) {
                        if (ahpf.b == null) {
                            ahpf.b = (ahbe)new agzb((agzi)ahpf.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ahpf.a;
            }
            case 4: {
                return new agza((agzi)ahpf.a);
            }
            case 3: {
                return new ahpf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahpf.a, "\u0001\u0005\u0000\u0001\u0002\u000f\u0005\u0000\u0000\u0005\u0002\u1409\u0002\u0005\u1409\u0006\u000b\u1409\u0003\r\u1409\n\u000f\u1409\u0001", new Object[] { "c", "e", "g", "f", "h", "d" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.i = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
