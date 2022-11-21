import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aief extends ahcz implements aheo
{
    public static final aief a;
    private static volatile ahev e;
    public int b;
    public Object c;
    public ahdp d;
    
    static {
        ahcz.registerDefaultInstance(aief.class, a = new aief());
    }
    
    private aief() {
        this.b = 0;
        this.d = ahcz.emptyProtobufList();
        ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = aief.e) == null) {
                    synchronized (aief.class) {
                        if (aief.e == null) {
                            aief.e = (ahev)new ahcs((ahcz)aief.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aief.a;
            }
            case 4: {
                return new ahcr((ahcz)aief.a);
            }
            case 3: {
                return new aief();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aief.a, "\u0001\u0004\u0001\u0000\u0001\ufbdb\ud283\u0004\u0000\u0001\u0000\u0001\u001a\uf646\u9cb5\u103c\u0000\ueacc\ubbb8\u103c\u0000\ufbdb\ud283\u103c\u0000", new Object[] { "c", "b", "d", apyo.class, aoui.class, antn.class });
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
