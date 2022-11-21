import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahlk extends ahcz implements aheo
{
    public static final ahlk a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(ahlk.class, a = new ahlk());
    }
    
    private ahlk() {
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
                if ((d = ahlk.d) == null) {
                    synchronized (ahlk.class) {
                        if (ahlk.d == null) {
                            ahlk.d = (ahev)new ahcs((ahcz)ahlk.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahlk.a;
            }
            case 4: {
                return new ahcr((ahcz)ahlk.a);
            }
            case 3: {
                return new ahlk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahlk.a, "\u0001\u0003\u0001\u0000\uff28\u1dbe\uf72c\u4c0d\u0003\u0000\u0000\u0003\uff28\u1dbe\u143c\u0000\ued6a\u25bb\u143c\u0000\uf72c\u4c0d\u143c\u0000", new Object[] { "c", "b", ahlh.class, aixb.class, ajaf.class });
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
