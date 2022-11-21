import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoqk extends ahcz implements aheo
{
    public static final aoqk a;
    private static volatile ahev b;
    private int c;
    private anxb d;
    private aisc e;
    private ahjl f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(aoqk.class, a = new aoqk());
    }
    
    private aoqk() {
        this.g = 2;
        emptyProtobufList();
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = aoqk.b) == null) {
                    synchronized (aoqk.class) {
                        if (aoqk.b == null) {
                            aoqk.b = (ahev)new ahcs((ahcz)aoqk.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoqk.a;
            }
            case 4: {
                return new ahcr((ahcz)aoqk.a);
            }
            case 3: {
                return new aoqk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aoqk.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0003\u1409\u0001\u0004\u1409\u0002", new Object[] { "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
