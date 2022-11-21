// 
// Decompiled by Procyon v0.6.0
// 

final class aepu extends IllegalStateException
{
    public aepu() {
        super("Calls to subscribe() should only be made by user action, from callbacks like click handlers. To set up a \"first load\" for a LocalDataSource subscription, use the `register()` overload that accepts an `initialLocalDataSource parameter. The `initialLocalDataSource` will be loaded from when the Lifecycle reaches STARTED for the first time.");
    }
}
