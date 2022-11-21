import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqsz extends ahcz implements aheo
{
    public static final aqsz a;
    private static volatile ahev d;
    public long b;
    public int c;
    private int e;
    
    static {
        ahcz.registerDefaultInstance(aqsz.class, a = new aqsz());
    }
    
    private aqsz() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = aqsz.d) == null) {
                    synchronized (aqsz.class) {
                        if (aqsz.d == null) {
                            aqsz.d = (ahev)new ahcs((ahcz)aqsz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqsz.a;
            }
            case 4: {
                return new ahcr((ahcz)aqsz.a);
            }
            case 3: {
                return new aqsz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqsz.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1004\u0001", new Object[] { "e", "b", "c" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
