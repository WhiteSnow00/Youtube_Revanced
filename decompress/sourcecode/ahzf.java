import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahzf extends agzi implements ahax
{
    public static final ahzf a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private aibc f;
    private aibc g;
    private ahfw h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance(ahzf.class, a = new ahzf());
    }
    
    private ahzf() {
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
                if ((b2 = ahzf.b) == null) {
                    synchronized (ahzf.class) {
                        if (ahzf.b == null) {
                            ahzf.b = (ahbe)new agzb((agzi)ahzf.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ahzf.a;
            }
            case 4: {
                return new agza((agzi)ahzf.a);
            }
            case 3: {
                return new ahzf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahzf.a, "\u0001\u0005\u0000\u0001\u0003\u000b\u0005\u0000\u0000\u0005\u0003\u1409\u0004\u0004\u1409\u0005\b\u1409\b\n\u1409\u0003\u000b\u1409\u0006", new Object[] { "c", "e", "f", "h", "d", "g" });
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
