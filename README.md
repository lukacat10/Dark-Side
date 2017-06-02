# Dark-Side
Time to experience the Dark Side.
A minecraft mod.

### Structure of the project:
* Project consists of the main package which includes the main class: com.gmail.lukacat100.darkside.DarkSide.
* "com.gmail.lukacat100.darkside.CommonProxy" is the shared proxy between the client AND the server.
* "com.gmail.lukacat100.darkside.ClientProxy" is the client-ONLY proxy.
* Each item, block, etc has its own init() and initClient() in order to ease searching for stuff. This methods will contain commands to be transferred to their appropriate proxies.

## Pull Requests:
1. WILL ONLY BE ACCEPTED WITH THE SAME LICENSE APPLIED TO THEM (Mozilla Public License 2).
