import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agun extends ahcz implements aheo
{
    public static final agun a;
    private static volatile ahev e;
    public int b;
    public ahdp c;
    public agup d;
    
    static {
        ahcz.registerDefaultInstance(agun.class, a = new agun());
    }
    
    private agun() {
        this.c = ahcz.emptyProtobufList();
    }
    
    public final void a() {
        final ahdp c = this.c;
        if (!c.c()) {
            this.c = ahcz.mutableCopy(c);
        }
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
                if ((e = agun.e) == null) {
                    synchronized (agun.class) {
                        if (agun.e == null) {
                            agun.e = (ahev)new ahcs((ahcz)agun.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agun.a;
            }
            case 4: {
                return new ahcr((ahcz)agun.a);
            }
            case 3: {
                return new agun();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agun.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u1009\u0000", new Object[] { "b", "c", agul.class, "d" });
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
