import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajne extends ahcz implements aheo
{
    public static final ajne a;
    private static volatile ahev c;
    public ahdp b;
    
    static {
        ahcz.registerDefaultInstance(ajne.class, a = new ajne());
    }
    
    private ajne() {
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
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev c;
                if ((c = ajne.c) == null) {
                    synchronized (ajne.class) {
                        if (ajne.c == null) {
                            ajne.c = (ahev)new ahcs((ahcz)ajne.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ajne.a;
            }
            case 4: {
                return new ahcr((float[][][])null, (short[][])null);
            }
            case 3: {
                return new ajne();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajne.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", ajnb.class });
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
