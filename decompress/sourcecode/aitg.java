import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aitg extends agzi implements ahax
{
    public static final aitg a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private aioe e;
    private ahfw f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(aitg.class, a = new aitg());
    }
    
    private aitg() {
        this.g = 2;
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
                if ((b2 = aitg.b) == null) {
                    synchronized (aitg.class) {
                        if (aitg.b == null) {
                            aitg.b = (ahbe)new agzb((agzi)aitg.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aitg.a;
            }
            case 4: {
                return new agza((agzi)aitg.a);
            }
            case 3: {
                return new aitg();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aitg.a, "\u0001\u0003\u0000\u0001\u0001\n\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0006\u1409\u0005\n\u1409\u0006", new Object[] { "c", "d", "e", "f" });
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
