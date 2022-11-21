import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoiu extends ahcz implements aheo
{
    public static final aoiu a;
    public static final ahcx b;
    private static volatile ahev i;
    public int c;
    public aqiq d;
    public ajol e;
    public boolean f;
    public boolean g;
    public CommandOuterClass$Command h;
    private amms j;
    private ahej k;
    private byte l;
    
    static {
        final aoiu a2 = new aoiu();
        ahcz.registerDefaultInstance(aoiu.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 221293762, ahgc.k, aoiu.class);
    }
    
    private aoiu() {
        this.k = ahej.a;
        this.l = 2;
        final ahbt b = ahbt.b;
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
                if ((i = aoiu.i) == null) {
                    synchronized (aoiu.class) {
                        if (aoiu.i == null) {
                            aoiu.i = (ahev)new ahcs((ahcz)aoiu.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return aoiu.a;
            }
            case 4: {
                return new ahcr((ahcz)aoiu.a);
            }
            case 3: {
                return new aoiu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aoiu.a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0001\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1007\u0003\u0005\u1007\u0005\u0006\u1009\u0006\u0007\u1409\u0007\b2", new Object[] { "c", "d", "e", "f", "g", "j", "h", "k", aoit.a });
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
