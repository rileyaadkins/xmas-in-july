export { createFooter };

const createFooter = () => {
  const footer = document.createElement("footer");
  footer.innerHTML = "&copy; four-on-the-floor 2020";
  return footer;
};
