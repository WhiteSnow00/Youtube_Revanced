import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoju extends ahcz implements aheo
{
    public static final aoju a;
    private static volatile ahev c;
    public ahdp b;
    private byte d;
    
    static {
        ahcz.registerDefaultInstance(aoju.class, a = new aoju());
    }
    
    private aoju() {
        this.d = 2;
        this.b = ahcz.emptyProtobufList();
    }
    
    public final void a() {
        final ahdp b = this.b;
        if (!b.c()) {
            this.b = ahcz.mutableCopy(b);
        }
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte d = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev c;
                if ((c = aoju.c) == null) {
                    synchronized (aoju.class) {
                        if (aoju.c == null) {
                            aoju.c = (ahev)new ahcs((ahcz)aoju.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aoju.a;
            }
            case 4: {
                return new ahcr((char[])null, (boolean[])null);
            }
            case 3: {
                return new aoju();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aoju.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u041b", new Object[] { "b", aojs.class });
            }
            case 1: {
                if (o == null) {
                    d = 0;
                }
                this.d = d;
                return null;
            }
            case 0: {
                return this.d;
            }
        }
    }
}
