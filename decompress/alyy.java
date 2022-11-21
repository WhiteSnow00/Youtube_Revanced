import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alyy extends ahcz implements aheo
{
    public static final alyy a;
    private static volatile ahev k;
    public int b;
    public ajws c;
    public long d;
    public long e;
    public double f;
    public aowb g;
    public CommandOuterClass$Command h;
    public CommandOuterClass$Command i;
    public CommandOuterClass$Command j;
    private byte l;
    
    static {
        ahcz.registerDefaultInstance(alyy.class, a = new alyy());
    }
    
    private alyy() {
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
                final ahev k;
                if ((k = alyy.k) == null) {
                    synchronized (alyy.class) {
                        if (alyy.k == null) {
                            alyy.k = (ahev)new ahcs((ahcz)alyy.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return alyy.a;
            }
            case 4: {
                return new ahcr((ahcz)alyy.a);
            }
            case 3: {
                return new alyy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alyy.a, "\u0001\b\u0000\u0001\u0002\t\b\u0000\u0000\u0005\u0002\u1409\u0001\u0003\u1002\u0002\u0004\u1002\u0003\u0005\u1000\u0004\u0006\u1409\u0005\u0007\u1409\u0006\b\u1409\u0007\t\u1409\b", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "j" });
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
