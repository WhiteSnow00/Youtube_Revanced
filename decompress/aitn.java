import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class aitn extends ahcz implements aheo
{
    public static final aitn a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aitn.class, a = new aitn());
    }
    
    private aitn() {
        this.e = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = aitn.b) == null) {
                    synchronized (aitn.class) {
                        if (aitn.b == null) {
                            aitn.b = (ahev)new ahcs((ahcz)aitn.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aitn.a;
            }
            case 4: {
                return new ahcr((ahcz)aitn.a);
            }
            case 3: {
                return new aitn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aitn.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
