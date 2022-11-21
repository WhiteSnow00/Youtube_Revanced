import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aops extends ahcz implements aheo
{
    public static final aops a;
    private static volatile ahev m;
    public int b;
    public int c;
    public Object d;
    public aowb e;
    public ahdh f;
    public ajws g;
    public ajws h;
    public ahdp i;
    public anxb j;
    public anxb k;
    public ahbt l;
    private ahjl n;
    private byte o;
    
    static {
        ahcz.registerDefaultInstance(aops.class, a = new aops());
    }
    
    private aops() {
        this.c = 0;
        this.o = 2;
        this.f = ahcz.emptyIntList();
        this.i = ahcz.emptyProtobufList();
        this.l = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte o3 = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev m;
                if ((m = aops.m) == null) {
                    synchronized (aops.class) {
                        if (aops.m == null) {
                            aops.m = (ahev)new ahcs((ahcz)aops.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return aops.a;
            }
            case 4: {
                return new ahcr((ahcz)aops.a);
            }
            case 3: {
                return new aops();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aops.a, "\u0001\u000b\u0001\u0001\u0001\u000b\u000b\u0000\u0002\t\u0001\u1409\u0003\u0002\u1409\u0004\u0003\u1409\u0005\u0004\u041b\u0005\u1409\u0006\u0006\u1409\u0007\u0007\u1409\b\b\u100a\t\t\u143c\u0000\n\u143c\u0000\u000b\u001d", new Object[] { "d", "c", "b", "e", "g", "h", "i", ajws.class, "j", "k", "n", "l", aowb.class, akfj.class, "f" });
            }
            case 1: {
                if (o == null) {
                    o3 = 0;
                }
                this.o = o3;
                return null;
            }
            case 0: {
                return this.o;
            }
        }
    }
}
