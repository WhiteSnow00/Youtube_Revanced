import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajmf extends ahcz implements aheo
{
    public static final ajmf a;
    private static volatile ahev i;
    public int b;
    public int c;
    public Object d;
    public ajws e;
    public akfj f;
    public ajws g;
    public boolean h;
    private aisc j;
    private ajws k;
    private byte l;
    
    static {
        ahcz.registerDefaultInstance(ajmf.class, a = new ajmf());
    }
    
    private ajmf() {
        this.c = 0;
        this.l = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte l = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev i;
                if ((i = ajmf.i) == null) {
                    synchronized (ajmf.class) {
                        if (ajmf.i == null) {
                            ajmf.i = (ahev)new ahcs((ahcz)ajmf.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return ajmf.a;
            }
            case 4: {
                return new ahcr((ahcz)ajmf.a);
            }
            case 3: {
                return new ajmf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajmf.a, "\u0001\b\u0001\u0001\u0001\n\b\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1037\u0000\u0005\u103b\u0000\u0006\u1007\u0005\t\u1409\b\n\u1409\t", new Object[] { "d", "c", "b", "e", "f", "g", "h", "j", "k" });
            }
            case 1: {
                if (o == null) {
                    l = 0;
                }
                this.l = l;
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
