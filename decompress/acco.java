import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acco extends ahcz implements aheo
{
    public static final acco a;
    private static volatile ahev g;
    public int b;
    public String c;
    public ahbt d;
    public ahdp e;
    public ahbt f;
    
    static {
        ahcz.registerDefaultInstance(acco.class, a = new acco());
    }
    
    private acco() {
        this.c = "";
        this.d = ahbt.b;
        this.e = ahcz.emptyProtobufList();
        this.f = ahbt.b;
    }
    
    public final void a() {
        final ahdp e = this.e;
        if (!e.c()) {
            this.e = ahcz.mutableCopy(e);
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
                final ahev g;
                if ((g = acco.g) == null) {
                    synchronized (acco.class) {
                        if (acco.g == null) {
                            acco.g = (ahev)new ahcs((ahcz)acco.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return acco.a;
            }
            case 4: {
                return new ahcr((ahcz)acco.a);
            }
            case 3: {
                return new acco();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)acco.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u100a\u0001\u0003\u001c\u0004\u100a\u0002", new Object[] { "b", "c", "d", "e", "f" });
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
