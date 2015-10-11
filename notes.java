/*Login Screen Button */
ParseObject person = new ParseObject("Person");
person.put("userName", "USERNAME");
person.put("password", "PASSWORD");
person.saveInBackground();

/* should show on screen the time post was posted */
ParseObject post = new ParseObject("Post");
post.put("title", "TITLE");
post.put("description", "DESCRIPTION");
post.put("comments", [an array of comments]);
ParseGeoPoint point = new ParseGeoPoint(LATITUDE, LONGITUDE);
post.put("location", point);
post.put("picture", picture); /* optional */
post.put("author", USERNAME);
post.put("upVotes", 0); /* should i have persons keep track of their own
upVotes */
post.saveInBackground();

/* when posts get upVoted */
thatpost.increment("upVotes");
thatpost.saveInBackground();

/* when user creates a post */
str[] posts = thatuser.getArray("posts"); /*parse can only do array of bytes */
posts.add(COMMENT);
posts.saveInBackground(); /* each modification to array needs its own
saveInBackground */

/* should show on screen the time comment was created */
ParseObject comment = new ParseObject("Comment");
comment.put("author", USERNAME); /* do not show author on screen */
comment.put("reply", "REPLY");
comment.put("parent", post); /* relation */
comment.saveInBackground();

/* getting the nearest posts. add to the UX's Front Page */
/* getting user's current location from
 * com.google.android.gms.location */
ParseGeoPoint userLocation = new ParseGeoPoint( , );
ParseQuery<ParseObject> query = ParseQuery.getQuery("Post");
query.whereNear("location", userLocation);
query.findInBackground(new FindCallback<ParseObject>() {
  public void done(List<ParseObject> sortedPosts, ParseException e) {
    if (e == null) {
      Log.d("post", "Retrieved " + sortedPosts.size() + " posts");
    } else {
      Log.d("post", "Error: " + e.getMessage());
    }
  }
}


