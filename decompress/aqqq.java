import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqqq extends ahcz implements aheo
{
    public static final aqqq a;
    public static final ahcx b;
    private static volatile ahev j;
    public int c;
    public int d;
    public Object e;
    public int f;
    public boolean g;
    public CommandOuterClass$Command h;
    public String i;
    private byte k;
    
    static {
        final aqqq a2 = new aqqq();
        ahcz.registerDefaultInstance(aqqq.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aqkf.a, a2, (MessageLite)a2, null, 272494533, ahgc.k, aqqq.class);
    }
    
    private aqqq() {
        this.d = 0;
        this.k = 2;
        this.g = true;
        this.i = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev j;
                if ((j = aqqq.j) == null) {
                    synchronized (aqqq.class) {
                        if (aqqq.j == null) {
                            aqqq.j = (ahev)new ahcs((ahcz)aqqq.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return aqqq.a;
            }
            case 4: {
                return new ahcr((ahcz)aqqq.a);
            }
            case 3: {
                return new aqqq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqqq.a, "\u0001\u0006\u0001\u0001\u0002\t\u0006\u0000\u0000\u0001\u0002\u1037\u0000\u0003\u1034\u0000\u0004\u1004\u0003\u0007\u1007\u0006\b\u1409\u0007\t\u1008\b", new Object[] { "e", "d", "c", "f", "g", "h", "i" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
