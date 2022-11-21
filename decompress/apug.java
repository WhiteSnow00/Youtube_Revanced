import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apug extends ahcz implements aheo
{
    public static final apug a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(apug.class, a = new apug());
    }
    
    private apug() {
        this.b = 0;
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
                final ahev d;
                if ((d = apug.d) == null) {
                    synchronized (apug.class) {
                        if (apug.d == null) {
                            apug.d = (ahev)new ahcs((ahcz)apug.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apug.a;
            }
            case 4: {
                return new ahcr((ahcz)apug.a);
            }
            case 3: {
                return new apug();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apug.a, "\u0001\u0004\u0001\u0000\ue1b7\u3802\uf676\u4665\u0004\u0000\u0000\u0004\ue1b7\u3802\u143c\u0000\ue4d4\u380d\u143c\u0000\ue206\u3820\u143c\u0000\uf676\u4665\u143c\u0000", new Object[] { "c", "b", apuf.class, apue.class, apuh.class, apud.class });
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
