import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arby extends ahcz implements aheo
{
    public static final arby a;
    private static volatile ahev g;
    public int b;
    public int c;
    public Object d;
    public int e;
    public ahdp f;
    
    static {
        ahcz.registerDefaultInstance(arby.class, a = new arby());
    }
    
    private arby() {
        this.c = 0;
        this.f = ahcz.emptyProtobufList();
    }
    
    public final void a() {
        final ahdp f = this.f;
        if (!f.c()) {
            this.f = ahcz.mutableCopy(f);
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
                if ((g = arby.g) == null) {
                    synchronized (arby.class) {
                        if (arby.g == null) {
                            arby.g = (ahev)new ahcs((ahcz)arby.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return arby.a;
            }
            case 4: {
                return new ahcr((boolean[])null, (float[][])null);
            }
            case 3: {
                return new arby();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)arby.a, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u100c\u0000\u0002\u103c\u0000\u0003\u001b\u0004\u103c\u0000", new Object[] { "d", "c", "b", "e", aqym.o, arbv.class, "f", arbw.class, arbx.class });
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
