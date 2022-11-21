import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aojk extends ahcz implements aheo
{
    public static final aojk a;
    private static volatile ahev b;
    private int c;
    private anxb d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aojk.class, a = new aojk());
    }
    
    private aojk() {
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
                if ((b = aojk.b) == null) {
                    synchronized (aojk.class) {
                        if (aojk.b == null) {
                            aojk.b = (ahev)new ahcs((ahcz)aojk.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aojk.a;
            }
            case 4: {
                return new ahcr((ahcz)aojk.a);
            }
            case 3: {
                return new aojk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aojk.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
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
